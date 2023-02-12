public class func{
public void loadWords(){
    InputStream inputStream = LoadData.class.getResourceAsStream("words.txt");
    BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
    while ((word = reader.readLine()) != null) {
      words.add(word.trim());
    }
    reader.close();
}
}
