public class func{
public void parseStringField(BufferedReader reader){
        while(reader.read(tmp) > 0 ){
            temp = Character.toString(tmp[0]);
            if (temp.equals("/")){
                break;
            } else {
                sb.append(temp);
            }
        }
        String base30numberString = sb.toString();
        int base10equivalent = Integer.valueOf(base30numberString, 30);
        reader.read(stringBody);
        String stringData = new String(stringBody);
        dbgLog.finer("stringData="+stringData);
}
}
