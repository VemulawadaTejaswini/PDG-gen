//2
public class func{
	public void getRegex(){
        BufferedReader r = new BufferedReader(new FileReader("floppy_regex.txt"));
        while ((line = r.readLine()) != null)
            reg.add(new Pair(line, r.readLine()));
}
}
