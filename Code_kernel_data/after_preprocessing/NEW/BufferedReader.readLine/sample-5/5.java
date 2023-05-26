//5
public class func{
public void getShardEdataSize(String edataShardname){
        BufferedReader rd = new BufferedReader(new FileReader(new File(fname)));
        String ln = rd.readLine();
        rd.close();
        return Integer.parseInt(ln);
}
}
