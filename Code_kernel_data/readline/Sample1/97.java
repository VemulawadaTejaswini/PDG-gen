//96
public class func{
	public void readResourceTypes(TestData data,BufferedReader reader){
        while((line = reader.readLine()) != null) {
            if(line.contains("Type")) {
                String[] split = line.split(":");
                data.resTypes.add(split[1].trim());
            }
        }
}
}
