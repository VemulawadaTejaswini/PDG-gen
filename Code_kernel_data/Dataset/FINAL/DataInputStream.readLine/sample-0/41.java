public class func{
public void run(){
                while (((line = in.readLine()) != null) && !line.equals(".") && isRunning()) {
                    System.out.println("Readed from socket: " + line);
                    parseInput(line);
                }
                System.out.println("Closing socket connection " + server.getInetAddress());
                server.close();
}
}
