//114
public class func{
	public void indexText(BufferedReader reader){
    while ((line = reader.readLine()) != null) {
      final List<String> sentences = sentenceTokenizer.tokenize(line);
      for (String sentence : sentences) {
        add(sentence, null, null, -1);
      }
    }
}
}
