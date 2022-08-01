//91
public class func{
	public void readTextFromFile(String fileName){
    final File aFile = new File(fileName);
    if (!aFile.exists())
    {
      Logging.errorPrint("Could not find license at " + fileName);
      aString = LanguageBundle.getString("in_licNoInfo"); //$NON-NLS-1$

      return aString;
    }
      BufferedReader theReader = new BufferedReader(new InputStreamReader(new FileInputStream(aFile), "UTF-8"));
      final int length = (int) aFile.length();
      theReader.read(inputLine, 0, length);
      theReader.close();
}
}
