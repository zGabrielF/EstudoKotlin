package Exercicios
fun hello(nome: String){// pegar caracteres
    println("${nome.length} characters")
}
fun hello2(nome: String){// pegar nome e caracteres
    println("A String,${nome} contem  ${nome.length} characters")
}
fun main(){
    hello("Felipe")
    hello2("Douglas")

}