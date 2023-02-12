public class func{
public void agreementContents(){
      String filename = "terms_" + SystemGlobals.getValue(ConfigKeys.I18N_DEFAULT) + ".txt";
      File file = new File(directory + filename);
      if (!file.exists()) {
        filename = SystemGlobals.getValue(ConfigKeys.AGREEMENT_DEFAULT_FILE);
        file = new File(directory + filename);
        
        if (!file.exists()) {
          throw new FileNotFoundException("Could not locate any terms agreement file");
        }
      }
      fileReader = new FileReader(file);
      reader = new BufferedReader(fileReader);
      while ((c = reader.read(buffer, 0, buffer.length)) > -1) {
        contents.append(buffer, 0, c);
      }
}
}
