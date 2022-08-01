//62
public class func{
	public void readJensenLabAnnotations(){
    this.info("read DOID-Annotation from "+DOI_ANN);
    BufferedReader in=IOUtils.openURIForBufferedReading(DOI_ANN);
    while((line=in.readLine())!=null)
      {
      if(!line.startsWith("ENSP")) continue;
      }
    in.close();
}
}
