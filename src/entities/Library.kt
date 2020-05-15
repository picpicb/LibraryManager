package entities

class Library() {
    val bookList: ArrayList<Book> = ArrayList()

    fun addBook(book : Book) {
        bookList.add(book)
    }
}