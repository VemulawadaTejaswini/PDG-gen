//31
public class func{
	public void getNumericFieldAsRawString(BufferedReader reader){
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
        dbgLog.finer("base30numberString="+base30numberString);
}
}
