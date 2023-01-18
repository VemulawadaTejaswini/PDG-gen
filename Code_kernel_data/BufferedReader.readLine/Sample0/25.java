//24
public class func{
	public void importBooks(InputStream exportStream,Importer.CoverFinder coverFinder,Importer.OnImporterListener listener,int importFlags){
    BufferedReader in = new BufferedReader(new InputStreamReader(exportStream, UTF8),BUFFER_SIZE);
    while ((line = in.readLine()) != null) {
      importedString.add(line);
    }
    return importBooks(importedString, coverFinder, listener, importFlags);
}
}
