package xyz.luchengeng.minio.starter

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
internal class MinIOStarterApplication
    fun main(args: Array<String>) {
        runApplication<MinIOStarterApplication>(*args)
    }
