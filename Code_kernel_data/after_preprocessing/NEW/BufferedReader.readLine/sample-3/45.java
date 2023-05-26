//45
public class func{
public void readFromStream(InputStream in){
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        while ((strLine = br.readLine()) != null) {
            result.append(strLine);
        }
        in.close();
}
}
