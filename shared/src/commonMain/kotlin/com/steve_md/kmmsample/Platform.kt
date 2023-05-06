package com.steve_md.kmmsample

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform