//23
public class func{
public void ScrabbleDictionary(InputStream objDictionaryStream){
    BufferedReader bf=new BufferedReader(new InputStreamReader(objDictionaryStream));
    String sWord=bf.readLine();
    while (sWord!=null){
      storeWord(sWord);
      sWord=bf.readLine();
    }
}
}
