public class func{
public void stop(BundleContext context){
    InputStreamReader isr = new InputStreamReader(System.in);
    BufferedReader br = new BufferedReader(isr);
    System.out.println(br.readLine().trim().toUpperCase());
}
}
