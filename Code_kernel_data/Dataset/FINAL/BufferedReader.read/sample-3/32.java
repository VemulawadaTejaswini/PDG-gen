public class func{
public void parseNumericField(BufferedReader reader){
        while(reader.read(tmp) > 0 ){
            temp = Character.toString(tmp[0]);//new String(tmp);
            if (temp.equals("/")){
                break;
            } else {
                sb.append(temp);
            }
        }
        String base30numberString = sb.toString();
        dbgLog.finer("base30numberString="+base30numberString);
        int base10equivalent = Integer.valueOf(base30numberString, 30);
        dbgLog.finer("base10equivalent="+base10equivalent);
}
}
