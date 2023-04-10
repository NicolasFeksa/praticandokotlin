fun main() {
   var genericlist = listOf("Azul", 10, 1.05f, 'a')

    //genericas= aleatorias.
    println("Imprirmir ${genericlist.size}")
    println("${genericlist.lastIndex}")
    println(genericlist.contains("o"))
    println(genericlist.subList(1,2))
    println(genericlist.subList(1,2))
    //.sublist() escolhe elementos
    //.contains() procura se há elementos no listOf


    var specificList = listOf<String>("Azul", "Vermelho")
//specific= especifica, só strings.

    println("Imprimir ${specificList.size}")
    println("${specificList.lastIndex}")
    println(specificList.get(0))

//specificList.get() escolhe um elemento do lisOf
    //.lastIndex= indices tirando o 0
    //.size= conta elementos

    for( i in specificList) {
        println(i)
    }

    var genericlist = listOf("Azul", 10, 1.05f, 'a')


}