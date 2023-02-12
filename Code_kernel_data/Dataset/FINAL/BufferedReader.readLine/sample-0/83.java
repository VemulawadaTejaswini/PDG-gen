public class func{
public void main(String[] args){
        Socket socket = new Socket(HOST, PORT);
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
        String string = reader.readLine();
}
}
