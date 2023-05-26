public class func{
public void sendCommand(String command){
                socket = new Socket();
                socket.connect(socketAddress);
                writeLine(socket, command);
                String result = readLine(socket);
                log.info("Sent '" + command + "' to " + socketAddress + ": " + result, null);
                log.info("No Sling running at " + socketAddress, null);
                log.error("Failed sending '" + command + "' to " + socketAddress, ioe);
}
}
