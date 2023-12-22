import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		 String S = sc.next();
      	String[] SArray = S.split("");
      if( Arrays.equals(SArray[2], SArray[3])&&Arrays.equals(SArray[4], SArray[5])){
      System.out.println("Yes");}
      else{
      System.out.println("No");}
	}
}