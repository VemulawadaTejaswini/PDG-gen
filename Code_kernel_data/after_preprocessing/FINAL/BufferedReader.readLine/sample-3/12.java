public class func{
public void readJsonFile(){
        while ((line = br.readLine()) != null) {
            builder.append(line);
        }
        return builder.toString();
}
}
