//91
public class func{
public void fetchMedline(String id){
            URL url = new URL(baseUrl);
            URLConnection data = url.openConnection();
            return new MedlineImporter().importEntries(data.getInputStream());
}
}
