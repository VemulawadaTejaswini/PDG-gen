public class func{
public void getSpecCommandList(){
    BufferedReader reader = new BufferedReader(new InputStreamReader(specfilein));
    while((cmd=reader.readLine()) != null){
      cmdlist.add(cmd);
    }
}
}
