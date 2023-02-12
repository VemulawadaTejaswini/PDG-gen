public class func{
public void nextLine(BufferedReader reader){
      final String line = reader.readLine();
      if(line == null) 
        throw new TorParsingException("Did not find expected signature END header");
}
}
