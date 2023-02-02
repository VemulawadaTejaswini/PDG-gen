//16
public class func{
public void initList(){
        String line = dis.readLine();
        if (line == null) break;
        String[] tokes = line.split(" ");
        tableList.add(new WMoTable(tokes[0], tokes[1], tokes[2]));
}
}
