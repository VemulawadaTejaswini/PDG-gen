//13
public class func{
public void main(String args[]){
        PushbackInputStream pis = new PushbackInputStream
            ((new StringBufferInputStream("\r")));
        DataInputStream dis = new DataInputStream(pis);
        String line = dis.readLine();
        if (line == null) {
            throw new Exception ("Got null, should return empty line");
        }
        int count = pis.available();
        if (count != 0) {
            throw new Exception ("Test failed: available() returns "
                                 + count + "when the file is empty");
        }
}
}
