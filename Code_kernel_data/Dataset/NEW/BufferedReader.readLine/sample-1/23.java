//23
public class func{
public void loadReaderToList(Reader reader){
    BufferedReader bufferedReader = new BufferedReader(reader);
    while ((line = bufferedReader.readLine()) != null) 
      outList.add(line);
}
}
