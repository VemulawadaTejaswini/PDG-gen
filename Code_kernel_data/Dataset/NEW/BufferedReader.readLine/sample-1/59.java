//59
public class func{
public void slurp(String fname){
    while ( (str=istream.readLine()) != null) {
      String [] parts = str.split(",");
      l.add(parts[0] + ":" + parts[1] + ":" + parts[2]);
    }
    istream.close();
}
}
