//39
public class func{
public void readFromStream(InputStream in){
      BufferedInputStream inputStream = new BufferedInputStream(in);
      BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
      while(bufferedReader.ready()) {
         result.append(bufferedReader.readLine());
      }
      return result.toString();
}
}
