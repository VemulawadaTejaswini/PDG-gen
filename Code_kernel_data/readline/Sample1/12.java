//11
public class func{
	public void loadTestingIDs(File testingIDFile){
        BufferedReader in = new BufferedReader(new FileReader(testingIDFile));
        while ((id = in.readLine()) != null) {
            testingIDs.add(id);
        }
        in.close();
}
}
