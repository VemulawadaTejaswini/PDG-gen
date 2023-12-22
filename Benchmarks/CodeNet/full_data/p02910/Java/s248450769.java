import java.util.*;
public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
	  String s = sc.nextLine();
	  String ans = "Yes";
	  for(int i=0;i<s.length();i++){
	  	if(i%2==0&&s.substring(i,i+1).equals("L"))ans="No";
	  	if(i%2==1&&s.substring(i,i+1).equals("R"))ans="No";
	  }
	  System.out.println(ans);
	}
}