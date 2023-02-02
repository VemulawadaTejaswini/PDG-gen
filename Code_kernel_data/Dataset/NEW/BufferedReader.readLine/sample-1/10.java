//10
public class func{
public void getContent(String name){
        BufferedReader br = new BufferedReader(new FileReader(name));
        while ((line = br.readLine()) != null) {
            file += (line + '\n');
        }
        br.close();
}
}
