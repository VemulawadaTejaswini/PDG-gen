//154
public class func{
public void run(){
    logger.debug("Loading file into styled text (" + f.getAbsolutePath() + ")");
      BufferedReader in = new BufferedReader(new FileReader(f));
      while(in.ready()){
        in.read(buf);
        file = file + new String(buf);
      }
      styledText.setText(file);
}
}
