public class func{
public void getFromPdbId(String pdbId){
      URL url = new URL(PDB_URL_STUB + pdbId);
      is = url.openConnection().getInputStream();
}
}
