import java.util.*;

class Main{
	static public void main(String[] args){
		int[] num=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			int a=sc.nextInt();
			num[i]=a;
		}
		int nn;
		nn=num[0];
		num[0]=num[1];
		num[1]=nn;
		
		nn=num[0];
		num[0]=num[2];
		num[2]=nn;
		
		for(int r:num)
			System.out.printf(r+" ");
	}
}