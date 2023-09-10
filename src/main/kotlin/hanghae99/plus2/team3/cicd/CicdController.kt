package hanghae99.plus2.team3.cicd

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/api")
@RestController
class CicdController(
    private val cicdService: CicdService
) {

    @GetMapping("/health-check")
    fun healthCheck(): String {
        return "ok"
    }

    @GetMapping("/something")
    fun something(): String {
        return cicdService.doSomething()
    }
}
