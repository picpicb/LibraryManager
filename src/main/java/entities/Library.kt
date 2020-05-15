package entities

class Library() {
    var bookList = mutableListOf<Book>()

    fun addBook(book : Book) {
        bookList.add(book)
    }
}