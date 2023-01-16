//46
public class func{
	public void getTotalTerms(Configuration conf,String totalTermsPath){
    BufferedReader reader = getBufferedReader(conf, totalTermsPath);
    long totalTerms = Long.parseLong(reader.readLine());
    reader.close();
}
}
