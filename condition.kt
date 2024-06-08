

fun main(args: Array<String>) {
    // les conditions if et swith en kotlin
     var a:Int = 30
    var b:Int = 26
    if (a ==b){
        println("a et b sont egaux")
    }else{
        println("a et b ne sont pas egaux")
    }
    when(a){
        10->println("a egal a 10")
//        "bo"->println("a egal a bo")
        30->println("a egal a 30")
        else->println("a n'est pas egal a 10, 20 ou 30")
    }

    var result = if (a > b){
        a-b
    }else{
        b-a
    }

println(result)


}