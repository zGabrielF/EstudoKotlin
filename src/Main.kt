fun calculaBonus(a: Int, b: Int, c: Int) {
    println("O bonus é: ${a + b * c * 2}")
}

fun hello(nome: String) {
    println("Olá, $nome")
}

fun hello2(nome: String) = "Olá, $nome"

fun soma(a: Int, b: Int) = a + b


fun media(vararg notas: Float) {
    if (notas.isNotEmpty()) {
        var soma = 0f
        for (nota in notas) {
            soma += nota
        }
        println("A média é:${soma / notas.size}")
    }
}

fun main() {
    //media(10f, 8f)
    //media(1f, 5f, 2f, 7f)
    val str="lorem ipsum"
    print(str)
    str.contains("bla")
    str.startsWith("l")
    print(str)
    arrayOf(1,2)

}
