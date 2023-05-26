//9
public class func{
public void readData(File file){
      String line = reader.readLine();
      if (line == null)
        break;
      dataList.add(new JSONObject(line));
}
}
