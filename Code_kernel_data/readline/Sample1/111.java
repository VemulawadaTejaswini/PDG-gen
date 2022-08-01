//110
public class func{
	public void ParameterChecker(BufferedReader reader){
        while ((s = reader.readLine()) != null) {
            String[] tokens = s.split("\\s");
            map.put(tokens[0], tokens);
        }
}
}
