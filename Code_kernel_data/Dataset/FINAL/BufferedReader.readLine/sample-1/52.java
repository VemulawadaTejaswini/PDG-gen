public class func{
public void readLines(Reader r){
        BufferedReader br = new BufferedReader(r);
        while ((line = br.readLine()) != null) {
            l.add(line);
        }
        return (String[]) l.toArray(new String[0]);
}
}
