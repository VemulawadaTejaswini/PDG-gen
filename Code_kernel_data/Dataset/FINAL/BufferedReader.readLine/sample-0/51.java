public class func{
public void getService(String name){
        BufferedReader fin = new BufferedReader(new InputStreamReader(new FileInputStream(name)));
        returnValue = fin.readLine();
        fin.close();
}
}
