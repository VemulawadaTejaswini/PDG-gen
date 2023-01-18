//28
public class func{
	public void decodeNumberOfVariables(BufferedReader reader){
        while (reader.read(tmp) > 0) {
            temp = Character.toString(tmp[0]);
            if (temp.equals("/")) {
                break;
            } else {
                sb.append(temp);
            }
        }
        String rawNumberOfVariables = sb.toString();
        int rawLength = rawNumberOfVariables.length();
        String numberOfVariables = StringUtils.stripStart((StringUtils.strip(rawNumberOfVariables)), "0");
        if ((numberOfVariables.equals("")) && (numberOfVariables.length() == rawLength)){
            numberOfVariables ="0";
        }
        varQnty = Integer.valueOf(numberOfVariables, 30);
        dataTable.setVarQuantity(Long.valueOf(numberOfVariables, 30));
}
}
