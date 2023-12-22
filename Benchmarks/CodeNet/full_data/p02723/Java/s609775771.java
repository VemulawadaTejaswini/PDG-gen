public class Main {
	public static void main(String args[]) {
    	String strBase = "coffee";
      	String strInput =  new Scanner(System.in);
      
      	String strBaseChk = strBase.subString(3, 6);
      	String strInputChk = strInput.subString(3, 6);
      
      	if(strBaseChk.equals(strInputChk)) {
        	System.out.plintln("Yes");
        } else {
        	System.out.plintln("No");
        }
    }
}