public class func{
public void createCharSequence(Reader reader0){
      while((chars = reader.read(buff)) != -1) {
        result.write(buff, 0, chars);
      }
      reader.close();
}
}
