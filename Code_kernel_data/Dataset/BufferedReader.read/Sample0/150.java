//149
public class func{
	public void readFileFromClasspath(String fileName){
        br = new BufferedReader(new InputStreamReader(new ClassPathResource(fileName).getInputStream(), "UTF-8"));
        for (int c = br.read(); c != -1; c = br.read()) {
            sb.append((char) c);
        }
        return sb.toString();
}
}
