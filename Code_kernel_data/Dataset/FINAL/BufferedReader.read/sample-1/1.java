public class func{
public void extractReaderContents(BufferedReader bufferedReader){
      int readCharacterCount = bufferedReader.read(readInCharacters);
      while (readCharacterCount > -1) {
        contents.append(String.valueOf(readInCharacters));
        readCharacterCount = bufferedReader.read(readInCharacters);
      }
      bufferedReader.close();
}
}
