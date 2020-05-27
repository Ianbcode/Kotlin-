/* Ian Becker
   Cse_408_Problem_4
 */
//importing java library to use filereader
import java.io.FileReader
//main function to read a file
fun main(args:Array<String>) {
    var namefile = "testfile.txt"
    ReadFromFile(namefile)
}
//takes a text file and reads and outputs the file content
fun ReadFromFile(namefile: String) {
    try {
        var fileinput = FileReader(namefile)
        var countingchar: Int?  //placeholder to read each char
        do {
            countingchar = fileinput.read()
            print(countingchar.toChar())    //prints content
        } while (countingchar!=-1)  //reads till the last char
    } catch (ex:Exception) {
        print(ex.message)   //prints message if an error pops up
    }
}