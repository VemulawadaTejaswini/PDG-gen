//24
public class func{
public void readUserInput(){
            while ((charOut = bufReader.read()) != -1) {
                output = output.concat(String.valueOf(Character.valueOf((char) charOut)));
            }
}
}
