package myFitstJAVA;


import java.io.BufferedReader
import java.io.IOException
import java.io.InputStreamReader

object TestInput {
    @Throws(IOException::class)
    @JvmStatic
    fun main(args: Array<String>) {

        // BufferedReader
        val reader = BufferedReader(InputStreamReader(System.`in`))
        print("What is your name? :")
        val name = reader.readLine()
        println("Your name is " + name)


    }//main


}// class