//5
public class func{
	public void readDemoClassNames(Reader reader){
        BufferedReader breader = new BufferedReader(reader);
        while((line = breader.readLine()) != null) {
            demoClassNames.add(line);
        }
        breader.close();
}
}
