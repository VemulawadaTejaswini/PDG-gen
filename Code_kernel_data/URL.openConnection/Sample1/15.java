//14
public class func{
	public void run(){
          URL u = new URL(QUESTIONNAIRE_URL);
          URLConnection c = u.openConnection();
          InputStream is = c.getInputStream();
          if (is != null) {
            BufferedReader rd = new BufferedReader(new InputStreamReader(is));
            s = rd.readLine();
            rd.close();
            if (s != null && s.length() > 7 && s.startsWith("http"))
              CaratApplication.storage.writeQuestionnaireUrl(s);
            else
              CaratApplication.storage.writeQuestionnaireUrl(" ");
          }
}
}
