//83
public class func{
public void convert(String r){
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return new String(XFormsConverter.fixStyle(sb.toString().getBytes()));
}
}
