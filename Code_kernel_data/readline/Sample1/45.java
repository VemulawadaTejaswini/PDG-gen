//44
public class func{
	public void eachLine(Action<String> action){
        BufferedReader reader = new BufferedReader(new StringReader(getOutput()));
            while ((line = reader.readLine()) != null) {
                action.execute(line);
            }
}
}
