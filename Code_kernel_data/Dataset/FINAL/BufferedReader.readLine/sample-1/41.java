public class func{
public void indexSentence(Sentence sentence,int docCount){
    final BufferedReader reader = new BufferedReader(new StringReader(sentence.getText()));
    while ((line = reader.readLine()) != null) {
      add(line, sentence.getSource(), sentence.getTitle(), docCount);
    }
}
}
