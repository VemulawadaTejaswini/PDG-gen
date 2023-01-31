//5
public class func{
	public void downloadURL(String theURL){
      u = new URL(theURL);
      is = u.openStream();
      dis = new DataInputStream(new BufferedInputStream(is));
      while ((s = dis.readLine()) != null)
        sb.append(s + "\n");
        if (is != null)
          is.close();
}
}
