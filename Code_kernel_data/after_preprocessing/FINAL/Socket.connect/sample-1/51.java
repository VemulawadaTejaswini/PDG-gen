public class func{
public void sendCommand(final String command){
                socket = new Socket();
                socket.connect(this.socketAddress);
                writeLine0(socket, this.secretKey + " " + command);
                final String result = readLine(socket);
                Main.info("Sent '" + command + "' to " + this.socketAddress + ": " + result, null);
                Main.info("No Apache Sling running at " + this.socketAddress, null);
                Main.error("Failed sending '" + command + "' to " + this.socketAddress, ioe);
}
}
