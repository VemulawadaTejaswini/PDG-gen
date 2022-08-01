//29
public class func{
	public void getHtml(BufferedReader bufferedReader){
        line = bufferedReader.readLine();
        line = StringUtils.removeStart(line, "html:\t");
        htmlBuilder.append(line);
        while ((line = bufferedReader.readLine()) != null) {
            htmlBuilder.append(line);
        }
        return htmlBuilder.toString();
}
}
