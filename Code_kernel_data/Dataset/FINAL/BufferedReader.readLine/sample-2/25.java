public class func{
public void read(BufferedReader in){
        String line = in.readLine();
        while(line != null){
            buffer.append(line + " ");
            line = in.readLine();
        }
}
}
