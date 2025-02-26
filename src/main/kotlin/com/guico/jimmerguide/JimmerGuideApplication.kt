package com.guico.jimmerguide

import org.babyfish.jimmer.sql.kt.KSqlClient
import org.babyfish.jimmer.sql.kt.ast.expression.eq
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import com.guico.jimmerguide.entity.*

@SpringBootApplication
class JimmerGuideApplication

fun main(args: Array<String>) {
    val ctx = runApplication<JimmerGuideApplication>(*args)
    val sqlClient = ctx.getBean(KSqlClient::class.java)

    val books = sqlClient.createQuery(Book::class) {
        where(table.name eq "GraphQL in Action")
        where(table.authors {
            id eq 1
        })
        select(
            table.fetchBy{
                allScalarFields()
                store {
                    allScalarFields()
                }
                authors {
                    allScalarFields()
                }
            }
        )
    }.execute()
    printResult(books)
}

private fun <R> printResult(rows: List<R>){
    // 打印出formatted json
    println(rows)
}
