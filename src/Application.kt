import entities.Book
import entities.Library
import java.util.*

fun main(){
    val library = Library()
    while(true) {
        println("Bienvenue dans votre bibliothèque. Pour ajouter un livre, appuyez sur une touche pour continuer")
        readLine()!!
        println("Auteur : ")
        val author = readLine()!!
        println("Titre : ")
        val title = readLine()!!
        println("Genre : ")
        val genre = readLine()!!
        val book = Book(UUID.randomUUID(), author, title, genre)
        library.addBook(book)
        println("La bibliothèque contient à présent les livres suivants : ")
        library.bookList.forEach() { book ->
            println(book.title)
        }
    }
}