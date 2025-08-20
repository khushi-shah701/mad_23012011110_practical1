fun main(){
   var d=Person("Khushi")
    d.name
}
class Person(name: String) {
    var name = this.also(::println)

    init {
        println("Hello")
    }
}