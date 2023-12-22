import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		 int n=scn.nextInt();
		 int m=scn.nextInt();
		 int [] arr = new int[m];
		 for(int i=0;i<m;i++){
			 arr[i]=scn.nextInt();
			 
		 }
		 for(int i=0;i<m;i++){
			 n-=arr[i];
			 if(n<0){
				 System.out.println(-1);
				 return;
			 }
		 }
		 System.out.println(n);

	}

}