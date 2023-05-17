public class func{
public void html2txt(String urlstring){
      URL url = new URL(urlstring);
      URLConnection yc = url.openConnection();
      yc.setConnectTimeout(5000);
      BufferedReader in = new BufferedReader(
            new InputStreamReader(
                  yc.getInputStream()));
      while ((inputLine = in.readLine()) != null) {
         txt = txt + inputLine;
      }
      in.close();   
}
}
