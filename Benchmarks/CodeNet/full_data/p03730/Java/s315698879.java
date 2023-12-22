import java.util.*;

public class Main {
	public static void main(String[] args){
	Scanner scn = new Scanner(System.in);
	int a = scn.nextInt();
      int b = scn.nextInt();
      int c = scn.nextInt();
      int check = 0;
      long x = (long)(5*Math.pow(10,13));
      for(long i=0; i<x; ++i){
        if((a*i) % b == c){
          check =1;
        }
      }
      if(check==0){
        System.out.println("No");
      }
      if(check==1){
        System.out.println("Yes");
      }
	}
}
