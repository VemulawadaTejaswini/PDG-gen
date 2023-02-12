public class func{
public void handleRequest(final Socket socket){
        final BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        final PrintWriter writer = new PrintWriter(new OutputStreamWriter(socket.getOutputStream()));
        do {
            request = reader.readLine();
        } while (handleRequest(writer, request));
        writer.close();
}
}
