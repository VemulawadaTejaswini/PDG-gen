//69
public class func{
public void loadColors(String file){
        while ((line = reader.readLine()) != null) {
            String[] tokens = line.split("\t");
            map.put(tokens[0], tokens[1]);
        }
        reader.close();
}
}
