package Repetição

fun main(){

    /*val str = "Gabriel"
    for(c in str){
        //print("$c")
    }*/

    //step = pula de valor em valor
    for (i in 0..100 step 5){
        println("$i ")
    }

    //downTo = ler de trás pra frente
    for (i in 100 downTo 1){
        println("$i ")
    }

}