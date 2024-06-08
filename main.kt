
fun main(){
    //commenattaire
    /**
     * @author NiBienvenu
     * @date 2024-06-08
     *
     */
    /*
    ghjgklhmno,nm
    jknbm

    */
    //Types donnees en kotlin
    /*
     val a:Int = 10
    val b:Double = 10.0
    val c:String = "Hello World"
    val d:Boolean = true
    val e:Char = 'a'
    val f:Float = 10.0f
    val g:Long = 10L
    val h:Short  = 10L
    val i:Any =5
    */
    // differences entre val et var

    val a:Int = 10 // const : javascript, final // java ou dart
    var b:Int = 10
//    a = 20
    b = 20
    var x = 5
    x=24
    val y ="somme $a + $b = ${a+b}"

    // affichage en kotlin
    println(y);

    // les collections en kotlin
    // arrayof
    var array = arrayOf(1,2,6,true,false) // egal arrayOf<Any>(1,2,6,true,false)
//    var list1 = arrayOf<>(1,2,6,"",false) // Erreur    en array
    var list = listOf(1,2,6,true,false) //
    var arraylist = arrayListOf(1,3,"exercises",false) //
    var map = hashMapOf(1 to "one", 2 to "two", 3 to "three")
    var set = setOf(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34)
    var listsort = listOf(1,8,3,4,5);
    // les methodes
    var size = array.size
    var lis = arraylist.add(5)
    map.put(7 ,"sept")
    // trie arraylist

    arraylist.reversed()

    println("La taile du list est $size")
    println(arraylist)
    println(map)
    println(listsort.sortedDescending())
}