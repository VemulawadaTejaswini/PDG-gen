import java.util.*;

public class Main {
	public static void main(String[] args) throws Exception{
	Scanner scn = new Scanner(System.in);
	int c = scn.nextInt();
      int check = 0;
      int[] a = new int[c];
      for(int i=0; i<a.length; ++i){
        a[i] = scn.nextInt();
      }
      int a1 = a[4] - a[1];
      int a2 = a[7] - a[4];
      int b1 = a[2] - a[1];
      int b2 = a[3] - a[2];
      
      if(a[5] != a[2]+a1){
        check = 1;
      }
       if(a[6] != a[3]+a1){
        check = 1;
      }
       if(a[8] != a[5]+a2){
        check = 1;
      }
       if(a[9] != a[6]+a2){
        check = 1;
      }
      
      if(check==0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
	}
}
