package com.haxos.jura

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform