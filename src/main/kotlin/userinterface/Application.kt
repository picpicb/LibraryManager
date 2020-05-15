package userinterface

import external.Export
import usecases.Management


fun main(){
    val management = Management(Export())

    while(true){
        println("Bienvenue dans votre bibliothèque. Voici le menu :")
        println("1 - Ajouter")
        println("2 - Lister")
        println("3 - Supprimer")
        println("4 - Compter")
        println("5 - Export")
        val userAction =  readLine()!!
        when (userAction) {
            "1" -> management.addBookToLibrary()
            "2" -> management.showLibrary()
            "3" -> management.deleteBook()
            "4" -> management.countBooks()
            "5" -> management.export()
            else -> {
                println(" -_- ")
            }
        }
    }

}