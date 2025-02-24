package com.guico.jimmerguide

import com.guico.jimmerguide.entity.Book
import org.babyfish.jimmer.sql.kt.KSqlClient
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class JimmerGuideApplication

fun main(args: Array<String>) {
    val ctx = runApplication<JimmerGuideApplication>(*args)
    val sqlClient = ctx.getBean(KSqlClient::class.java)

//    val books = sqlClient.createQuery(Book::class)


}

private fun <R> printResult(rows: List<R>){

}
