//36
public class func{
public void readTranscription(){
    BufferedReader txtReader = new BufferedReader(new FileReader(textFile));
    while ((line = txtReader.readLine()) != null) {
      finalText += " " + line;
    }
}
}
