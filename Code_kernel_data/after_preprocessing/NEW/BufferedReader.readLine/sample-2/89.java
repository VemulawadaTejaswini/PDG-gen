//89
public class func{
public void serve(Socket s){
      PrintStream ps = GetPrintStream(s);
      BufferedReader br = GetBufferedReader(s);
      String token = br.readLine();
      ps.println(token);
}
}
