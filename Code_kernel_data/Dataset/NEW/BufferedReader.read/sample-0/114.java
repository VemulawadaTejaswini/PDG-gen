//114
public class func{
public void run(){
          BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()), 1);
            while ((c = reader.read()) != -1) {
              callback.character((char)c);            
            }
}
}
