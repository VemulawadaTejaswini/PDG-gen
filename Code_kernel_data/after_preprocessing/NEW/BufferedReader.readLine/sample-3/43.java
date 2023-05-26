//43
public class func{
public void readText(Reader reader){
        while ((line = br.readLine()) != null) {
            text.append(line);
            text.append("\n");
        }
        return text.toString();
}
}
