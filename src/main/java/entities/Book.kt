package entities

import java.util.*

class Book(val id: UUID, val author: String, val title: String, val genre: String){

    override fun toString(): String {
        return "Book [id: ${this.id}, author: ${this.author}, title: ${this.title}, genre: ${this.genre} ]"
    }
}