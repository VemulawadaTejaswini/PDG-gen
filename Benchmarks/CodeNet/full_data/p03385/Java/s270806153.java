import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
 
              String[] strArray = sc.sprit("");
               if(strArray[1] != strArray[2] && strArray[2] != strArray[3] &&  strArray[3] != strArray[1]) System.out.print("Yes");
               else System.out.print("No");
	}
}