//352
public class func{
	public void testUI(){
        String host = (String) storm_conf.get("ui.host");
        if (host==null) host = "localhost";
        URL url = new URL("http://"+host+":"+storm_conf.get("ui.port")+"/");
        LOG.info("UI URL:"+url);
        URLConnection con = url.openConnection();
        Assert.assertNotNull(con);
        Assert.assertNotNull(con.getContent());
}
}
