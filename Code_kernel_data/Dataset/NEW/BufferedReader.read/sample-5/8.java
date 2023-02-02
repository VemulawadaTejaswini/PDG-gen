//8
public class func{
public void getTextInfos(){
        BufferedReader in = new BufferedReader(new InputStreamReader(
                getClass().getClassLoader().getResourceAsStream("SparqlTest.test"),
                Charset.forName("UTF8")));
        while (in.ready()) {
            if (in.read() == '<' && in.ready() && in.read() == '<') {
                in.readLine();
                textInfos.add(parseText(in));
            }
        }
}
}
