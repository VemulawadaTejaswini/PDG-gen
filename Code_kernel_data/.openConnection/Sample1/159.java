//158
public class func{
	public void announce(String trackerURL,byte[] hash,byte[] peerId,int port){
        + "?info_hash=" + URLEncoder.encode(new String(hash, Constants.BYTE_ENCODING), Constants.BYTE_ENCODING).replaceAll("\\+", "%20")
        + "&peer_id="   + URLEncoder.encode(new String(peerId, Constants.BYTE_ENCODING), Constants.BYTE_ENCODING).replaceAll("\\+", "%20")
      URL url = new URL(strUrl);
      URLConnection con = url.openConnection();
      con.connect();
      con.getContent();
}
}
