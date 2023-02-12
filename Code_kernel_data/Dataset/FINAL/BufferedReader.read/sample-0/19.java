public class func{
public void loadTheaterData(){
        BufferedReader reader = new BufferedReader(new InputStreamReader(
                DummyDataProvider.class.getResourceAsStream("cities.txt")));
            while ((numRead = reader.read(buf)) != -1) {
                String readData = String.valueOf(buf, 0, numRead);
                fileData.append(readData);
                buf = new char[1024];
            }
            reader.close();
}
}
