public class func{
public void process(Reader unbufferedReader){
      while ((length = bufferedReader.read(content)) > -1) {
        processEvents(decoderInstance.decodeEvents(String.valueOf(content,
            0, length)));
      }
}
}
