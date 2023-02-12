public class func{
public void getHTML(HttpURLConnection conn){
        while ((line = br.readLine()) != null) {
            htmlBuilder.append(line);
            htmlBuilder.append("\n");
        }
        br.close();
}
}
