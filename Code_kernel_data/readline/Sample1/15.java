//14
public class func{
	public void readCaptchaFile(String fileName){
      BufferedReader reader = new BufferedReader(new FileReader(new File(fileName)));
      while((line = reader.readLine()) != null)
        captchaList.add(line);
      reader.close();
}
}
