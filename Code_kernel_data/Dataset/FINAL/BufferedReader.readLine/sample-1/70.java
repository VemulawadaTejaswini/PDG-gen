public class func{
public void readFixture(String fixture){
        BufferedReader reader = new BufferedReader(new InputStreamReader(this.getClass().getResourceAsStream(fixture)));
        while(reader.ready()) {
            result += reader.readLine() + "\n";
        }
}
}
