package given.auron

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class AuronApplication

fun main(args: Array<String>) {
	runApplication<AuronApplication>(*args)
}
