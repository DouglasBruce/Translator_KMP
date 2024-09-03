package com.ragnarok.translator

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform