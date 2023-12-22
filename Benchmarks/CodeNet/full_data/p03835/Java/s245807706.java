import java.util.*;
public class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int k = sc.nextInt();
      int s = sc.nextInt();
      int count = 0;
      for(int i = 0;i <= k && i <= s;i++){
      	for(int j = 0;j <= k && j <= s-i;j++){
        	if(i+j <= s) count += s-i-j+1;
        }
      }
      System.out.println(count);
    }
}
