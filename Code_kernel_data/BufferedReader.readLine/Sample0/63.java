//62
public class func{
	public void verifyResult(){
    BufferedReader reader = new BufferedReader(new InputStreamReader(
        fs.open(new Path(OUTPUT + "/part-00000"))));
    while ((line = reader.readLine()) != null) {
      String[] temp = line.split("\t");
      assertTrue(outResults.containsKey(temp[0]));
      assertEquals(temp[1], outResults.get(temp[0]));
    }
}
}
