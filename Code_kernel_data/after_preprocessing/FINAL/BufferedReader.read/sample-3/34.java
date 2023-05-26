public class func{
public void getText(BufferedReader reader){
            while ((nbCharRead = reader.read(charBuffer)) != -1) {
                answer.append(charBuffer, 0, nbCharRead);
            }
}
}
