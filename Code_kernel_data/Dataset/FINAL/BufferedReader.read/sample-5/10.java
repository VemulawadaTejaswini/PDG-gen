public class func{
public void readLine(BufferedReader file){
        int aByte = file.read();
        while (aByte != -1) {
            if (aByte == '"') {
                inString = !inString;
            } else {
                if (!inString && aByte == '\n') {
                    break;
                } 
                retValue.append((char)aByte);
            }
            aByte = file.read();
        }
}
}
