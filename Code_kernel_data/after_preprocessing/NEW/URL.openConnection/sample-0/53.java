//53
public class func{
public void checkTaskGraphServlet(JobID job){
    URL url = new URL(jtURL + "/taskgraph?jobid=" + job.toString() + "&type=map");
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setRequestMethod("GET");
    connection.connect();
    assertEquals(200, connection.getResponseCode());
    String contents = slurpContents(connection);
    assertTrue("Bad contents for job " + job + ":\n" + contents,
      contents.contains("</svg>"));
}
}
