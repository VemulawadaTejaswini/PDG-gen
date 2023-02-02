//28
public class func{
public void setStopwords(File stopwordFile){
    BufferedReader input = new BufferedReader(new FileReader(stopwordFile)) ;
    while ((line=input.readLine()) != null) 
      stopwords.add(line.trim()) ;
}
}
