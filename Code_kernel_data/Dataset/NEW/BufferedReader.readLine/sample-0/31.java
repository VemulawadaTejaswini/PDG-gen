//31
public class func{
public void test1(){
    BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filepath), "UTF-8"));
    while((line = br.readLine())!=null){
      System.out.println(line);
    }
}
}
