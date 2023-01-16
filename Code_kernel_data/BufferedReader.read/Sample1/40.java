//39
public class func{
	public void getDataSet(){
    while ((c = is.read()) != -1) {
      txtStr.append((char) c);
    }
    newInst[0] = (double) data.attribute(0).addStringValue(txtStr.toString());
}
}
