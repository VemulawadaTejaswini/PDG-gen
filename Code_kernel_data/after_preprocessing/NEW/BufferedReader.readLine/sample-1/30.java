//30
public class func{
public void loadStopWords(String f){
    BufferedReader br = new BufferedReader(new FileReader(f));
    while ((line = br.readLine()) != null) {
      stopWords.add(line);
      stopWords.add(stem(line));
    }
}
}
