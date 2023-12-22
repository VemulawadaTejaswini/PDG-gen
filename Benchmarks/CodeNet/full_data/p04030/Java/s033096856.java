import java.util.Scanner;
//import java.util.Arrays;

public class Main{
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		String[] strArray = str.split("");
		String str_ans = "";

		for(int i = 0; i < strArray.length; i++){
			if(strArray[i].equals("0")){
				//if(!strArray[i+1].equals("B")){
				str_ans = str_ans + "0";
				//}
			}
			else if(strArray[i].equals("1")){
				//if(strArray[i+1].equals("B")){
				str_ans = str_ans + "1";
				//}
			}
			else if(strArray[i].equals("B")){
				if(!str_ans.equals("")){
					str_ans = str.substring(0, str_ans.length()-1);
				}
			}
		}
		System.out.println(str_ans);
	}
}
