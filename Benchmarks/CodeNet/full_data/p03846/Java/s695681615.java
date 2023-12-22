import java.util.*;
import java.util.Arrays;
public class Main {
	public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] member = new int[n];
      for(int i=0;i<n;i++){
        member[i]=sc.nextInt();
      }
      Arrays.sort(member);      
      if(n%2!=0 && member[0]!=0){
        System.out.println(0);
        System.exit(0);
      }else{
        for(int i=member.length-1;i>0;i-=2){
          if(member[i] != member[i-1]){
            System.out.println(0);
            System.exit(0);
          }
        }
      }
      long sortComb =(long)Math.pow(2, n/2);
      sortComb %= 1000000000 + 7;
      System.out.println(sortComb);
	}
}