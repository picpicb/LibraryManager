package external

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import entities.Library
import usecases.ExportLibrary
import java.io.File


class Export : ExportLibrary {
    override fun exportLibrary(library: Library) {
        val gson = Gson()
        File("MyLibrary.json").writeText(gson.toJson(library.bookList))
    }
}