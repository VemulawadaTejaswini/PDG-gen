import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int T1 = sc.nextInt();
		int T2 = sc.nextInt();
		int A1 = sc.nextInt();
   		int A2 = sc.nextInt();
        int B1 = sc.nextInt();
      	int B2 = sc.nextInt();
		int sa[] = new int[2];
        sa[0] = T1*A1-T1*B1;
        sa[1] = T2*A2-T2*B2;
        int count = -1;
      double x = 0;
      double xmae = 0;
      if(sa[0] == sa[1]*-1){
        System.out.println("infinity");
      }else{
        for(int i=0; i<1; ){
          count++;
          xmae = x;
          x += sa[count%2];
          if(x*xmae > 1){
            i = 1;
          }else if(x == 0){
            i = 1;
            count++;
          }
        }
   		System.out.println(count); 
      }
	}
}