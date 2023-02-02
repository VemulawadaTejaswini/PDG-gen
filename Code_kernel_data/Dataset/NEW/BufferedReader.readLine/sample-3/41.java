//41
public class func{
public void fileToString(String filename){
        while((line = reader.readLine()) != null){
            builder.append(line);
        }
        return builder.toString();
}
}
