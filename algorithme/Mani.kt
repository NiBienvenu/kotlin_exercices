package algorithme

fun main() {


    println(" somme de 1 à 8 ${sommeN(10)}")

}

fun changeV(){
    var a = 5;
    var b = 6;

    a = a+b
    b = a-b
    a = a-b

    println("a est $a  b est $b")
}

// Exercies 2
fun sommeN(n : Int) : Int{
    return (n * (n + 1)) / 2
}