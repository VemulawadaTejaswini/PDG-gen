import java.util.*;
public class Main{
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int l = sc.nextInt();
      int r = sc.nextInt();
      int min = 10000;
      if(r-l >= 2019){
        System.out.println(0);
        return;
      }
      else{
      	for(int i = l;i <= r-1;i++){
        	for(int j = i+1;j <= r;j++){
            	min = Math.min(min,(i*j)%2019);
            }
        }
      }
      System.out.println(min);
	}
} 