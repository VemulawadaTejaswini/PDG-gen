public class func{
public void initStopWords(File file){
    logger.info("reading stop words file: " + file.getAbsolutePath());
    BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
    while ((line = reader.readLine())!=null)
      stopWords.add(line.trim());
    logger.info(stopWords.size() +" stop words were read");
}
}
