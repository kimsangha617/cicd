package hanghae99.plus2.team3.cicd

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Profile

@Configuration
class ProfilesConfiguration {

    @Profile("prod")
    @Bean
    fun prod(): SuccessCicdService {
        return SuccessCicdService()
    }

    @Profile("alpha")
    @Bean
    fun alpha(): SuccessCicdService {
        return SuccessCicdService()
    }

    @Profile("fail")
    @Bean
    fun fail(): FailCicdService {
        return FailCicdService()
    }
}
