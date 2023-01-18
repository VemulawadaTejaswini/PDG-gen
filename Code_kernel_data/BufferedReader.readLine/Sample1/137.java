//136
public class func{
	public void readResponseLinesFromSauceLabToGetJobUrl(BufferedReader reader){
        while ((responseLineFromSauceLabs = reader.readLine()) != null) {
            jobUrl = jobUrl + processSauceLabsResponseLine(responseLineFromSauceLabs);
        }
}
}
