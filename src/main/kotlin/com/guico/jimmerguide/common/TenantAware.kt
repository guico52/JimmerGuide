package com.guico.jimmerguide.common

import org.babyfish.jimmer.sql.MappedSuperclass

@MappedSuperclass
interface TenantAware {

    val tenant: String
}