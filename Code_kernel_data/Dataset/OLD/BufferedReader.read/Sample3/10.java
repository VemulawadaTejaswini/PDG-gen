//9
public class func{
	public void parseStringField(BufferedReader reader){
        while(reader.read(tmp) > 0 ){
            temp = Character.toString(tmp[0]);//new String(tmp);
            if (temp.equals("/")){
                break;
            } else {
                sb.append(temp);
            }
            //temp = sb.toString();//new String(tmp);
        }
        String base30numberString = sb.toString();
        int base10equivalent = Integer.valueOf(base30numberString, 30);
        reader.read(stringBody);
        String stringData = new String(stringBody);
        dbgLog.finer("stringData="+stringData);
}
}
