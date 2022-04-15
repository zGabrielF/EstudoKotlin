fun operacao(a: Int, b: Int, c: String): Int {
    when (c) {
        "soma" -> return a + b
        "subtração" -> return a - b
        else ->
            return 0
    }
}

    fun main() {
    operacao(10, 10, "soma")
    operacao(10, 10, "subtração")
}