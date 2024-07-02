class Stack<E>(vararg val items: E){

    val  elements = items.toMutableList()

    fun push(element: E){
        elements.add(element)
    }
    fun pop(): E?{
        if (!isEmpty())
            return elements.removeAt(elements.size -1)
        return null
    }
    fun map(){
        elements.map {
            println(it)
        }
    }
    fun isEmpty(): Boolean{
        return elements.isEmpty()
    }
}

fun main() {
    val elements  = Stack<Int>(1,2,5)
    elements.push(6)
    elements.map()
}