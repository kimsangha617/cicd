package hanghae99.plus2.team3.cicd

interface CicdService {

    fun doSomething(): String
}

class SuccessCicdService() : CicdService {

    override fun doSomething(): String {
        return "something finished"
    }
}

class FailCicdService() : CicdService {
    override fun doSomething(): String {
        throw IllegalStateException()
    }
}
