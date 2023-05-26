//27
public class func{
public void fromStream(@NotNull InputStream stream){
        while ((line = reader.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
}
}
