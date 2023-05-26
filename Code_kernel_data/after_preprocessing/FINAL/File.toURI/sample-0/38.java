public class func{
public void cleanupReplacement(String... expectedFiles){
      for (String efile : expectedFiles)
        expected.add(new File(rootTabletDir, efile).toURI().toString());
      Assert.assertEquals(expected, new HashSet<String>(ret));
}
}
