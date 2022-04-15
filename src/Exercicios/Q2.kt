package Exercicios

// questão 1
fun maior(a: Int, b: Int) {
    if (a > b)
        println("o A é maior,$a")
    else
        println("o B é maior, $b")
}

// questão 2
fun maior2(a: Int, b: Int) {
    when {
        a > b -> println("o A é maior,$a")
        a == b -> println("Valores iguais")
        else -> println("o B é maior, $b")
    }
}

// questão 3

fun calcula(quantidade: Int) {
    val valor = if (quantidade > 10) {
        quantidade* 2
    } else {
        quantidade* 2
    }
    println(valor)
}


fun main() {
    //maior(1,2)
    //maior(2,1)
    calcula(10)
    calcula(11)
}
