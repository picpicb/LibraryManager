package usecases

import entities.Book
import entities.Library
import java.util.*

class Management {
    val library = Library()
    fun addBookToLibrary(){
            println("-- Auteur : ")
            val author = readLine()!!
            println("-- Titre : ")
            val title = readLine()!!
            println("-- Genre : ")
            val genre = readLine()!!
            val book = Book(UUID.randomUUID(), author, title, genre)
            library.addBook(book)
    }

    fun showLibrary(){
        println("-- La bibliothèque contient à présent les livres suivants : ")
        library.bookList.forEach() { book -> println("--  " + book.title) }
    }

    fun deleteBook(){
        println("-- Tapez l'id du livre à supprimer");
        val idbook = readLine()!!
        library.bookList.removeAll {it.id == UUID.fromString(idbook) }
        println("-- Le livre est supprimé");
    }

    fun countBooks(){
        println("-- La bibliothèque contient "+ library.bookList.count() + " livres")
    }
}