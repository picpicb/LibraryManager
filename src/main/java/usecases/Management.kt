package usecases

import entities.Book
import entities.Library
import java.util.*


interface ExportLibrary{
    fun exportLibrary(library: Library)
}

class Management(private val exportUtil : ExportLibrary) {
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
        library.bookList.forEach() { book -> println("--  " + book.title + "; ID: "+book.id) }
    }

    fun deleteBook(){
        println("-- Tapez l'id du livre à supprimer");
        val idbook = readLine()!!
        library.bookList.removeAll {it.id.toString() == idbook }
        println("-- Le livre est supprimé");
    }

    fun countBooks(){
        println("-- La bibliothèque contient "+ library.bookList.count() + " livres")
    }

    fun export(){
        exportUtil.exportLibrary(library)
    }

}
