//53
public class func{
public void handleRequest(BufferedReader reader,PrintWriter writer){
    String line = reader.readLine();
    LOG.info("Received: " + line + " going to divide by it");
    Integer toDivide = Integer.valueOf(line);
    writer.println(Integer.toString(100 / toDivide));
}
}
