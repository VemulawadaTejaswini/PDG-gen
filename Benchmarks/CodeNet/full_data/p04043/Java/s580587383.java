import java.util.*;

public class Main {
	 public static void main(String[] args){
		 Scanner sc = new Scanner(System.in);
		 int num[]=new int[3];
		 int count[]= {0,0};
		 for(int i=0;i<3;i++) {
			num[i] = sc.nextInt();
		 }
		 for(int i=0;i<3;i++) {
			 if(num[i]==5)
				 count[0]++;
			 else if(num[i]==7)
				 count[1]++;
		 }
		 if(count[0]==2&&count[1]==1)
			 System.out.println("YES");
		 else
			 System.out.println("NO");
	     sc.close();
	 }
}
