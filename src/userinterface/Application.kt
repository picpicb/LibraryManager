package userinterface

import usecases.Management


fun main(){
    val management = Management()
    while(true){
        println("Bienvenue dans votre bibliothèque. Voici le menu :")
        println("1 - Ajouter")
        println("2 - Lister")
        println("3 - Supprimer")
        println("4 - Compter")
        val userAction =  readLine()!!
        when (userAction) {
            "1" -> management.addBookToLibrary()
            "2" -> management.showLibrary()
            "3" -> management.deleteBook()
            "4" -> management.countBooks()
            else -> {
                println(" -_- ")
            }
        }
    }

}