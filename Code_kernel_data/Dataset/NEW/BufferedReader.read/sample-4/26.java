//26
public class func{
public void readTag(BufferedReader is){
         while (theChar != '>' && ((theChar = (char)is.read()) != -1)) {
           theTag.append(theChar);
         } // end while
}
}
