//135
public class func{
	public void cat(final BufferedReader reader){
        while ((line = reader.readLine()) != null) {
            if (displayLineNumbers) {
                System.out.print(String.format("%6d  ", lineno++));
            }
            System.out.println(line);
        }
}
}
