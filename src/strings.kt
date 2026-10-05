import java.util.Locale
import java.util.Locale.getDefault

fun main(){
    //strings - combination of characters to create words and sentences examples -name ,place ,statement
    val name = "j ohn"
    val place = "eldohub hub"
    println(name)

    //string formating

    //concatenation
    println("my name is "+ name + "and i come from " + place)
    //interpolation
    println("my place is $name and i come from $place")

    //access a string
    //indexes - position of a character that makes up the entire string (positioning/indexing begins from 0 ... )
    //example john - {j=0 , o=1 ,h=2 ,n=3}

    //nb
    //empty spaces are considered as characters
    //when accessing characters beyond the length of your string you will bump into a boundary error


    println(name[0])//first character
    println(name[1])//second character
    println(name[2])//third character
    println(name[3])//fourth character
    println(name[4])//fifth character


    //string functions
    //dot operator -enables us to use built-in functions with our strings
    println("length of name:${name.length} characters") //gives you the length of your string
    println("name to lower:${ name.lowercase(getDefault())}") //covert to lower
    println("name to upper:${ name.uppercase(getDefault())}") //covert to upper
    println("compare name and place values:${name.compareTo(place)}") //function compares two strings and returns 0 if both are equal
    println("index of hub :${place.indexOf("hub")}")// function returns the index (the position) of the first occurrence of a specified text in a string (including whitespace)



    //string functions for splitting a section of the whole  string
    //string indexing in terms of start and end position of a string
    //string functions-how can you join two strings together?







}