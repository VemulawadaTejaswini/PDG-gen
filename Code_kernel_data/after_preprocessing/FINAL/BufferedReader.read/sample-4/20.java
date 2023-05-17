public class func{
public void main(String argv[]){
    while((ch = is.read()) != -1) buffer.append((char) ch);
    RobustTokenizer<Word> t = new RobustTokenizer<Word>(buffer.toString());
    List<Word> tokens = t.tokenize();
    for(int i = 0; i < tokens.size(); i ++){
      System.out.println(tokens.get(i));
    }
}
}
