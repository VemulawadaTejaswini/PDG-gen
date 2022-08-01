//79
public class func{
	public void readLinesFromFile(BufferedReader reader){
        while (line != null) {
            line = reader.readLine();
            if (line != null) {
                lines.add(line.trim());
            }
        }
}
}
