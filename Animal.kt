open class Animal {
    var age: Int = 0
        get() =  field
         set(value) {
            if (value>0)
                field = value
        }


}
class Vegetal : Animal() {

    fun testAnimal(){
    }
}
fun main() {
    val animal = Animal()
    animal.age =5
    val vegetal = Vegetal().testAnimal()

    animal.age =-5
    println(animal.age)
}