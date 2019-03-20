import java.io.File
import java.io.PrintWriter

class Serializer(val compute:ComputeData, val index: Int) {

    fun ToHTML(){
        File("toHTML.txt").printWriter().use { out ->
            out.print("<HTML><HEAD><TITLE>Liskov</TITLE></HEAD>" +
                    "<BODY>" +
                    "<p><h1>" + compute.Sum() + "</h1></p>" +
                    "</BODY></HTML>" )
        }

    }

    fun ToJSON(){
        File("toJSON.txt").printWriter().use { out ->
            out.print("Sum: "+ compute.Sum())
        }
    }
}