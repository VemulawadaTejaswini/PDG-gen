//135
public class func{
	public void getConnection(String action,String newEncounterNumber,int groupSize,String nodeIdentifier,int numProcessors){
    if (!newEncounterNumber.equals("")) {
      encNumParam = "&newEncounterNumber=" + newEncounterNumber;
    }
    URL u = new URL(thisURLRoot + "/ScanAppletSupport?version=" + version + "&nodeIdentifier=" + nodeIdentifier + "&action=" + action + encNumParam + "&groupSize=" + groupSize + "&numProcessors=" + numProcessors);
    URLConnection con = u.openConnection();
    con.setDoInput(true);
    con.setDoOutput(true);
    con.setUseCaches(false);
    con.setDefaultUseCaches(false);
    con.setRequestProperty("Content-type", "application/octet-stream");
    con.setAllowUserInteraction(false);
}
}
