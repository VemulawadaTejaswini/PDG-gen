import java.util.Scanner;

public class Main {
	public static int num1[],num2[];
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int arr[]=new int[N];
		int count1=0,count2=0,zero=0;
		int min=0,result1=500,result2=500,result;
		for(int i=0;i<N;i++) {
			arr[i]=sc.nextInt();
			if(arr[i]<0) {
				count1++;
			}else if(arr[i]>0) {
				count2++;
			}else {
				zero=1;
			}
		}
		num1=new int[count1];
		for(int i=0;i<count1;i++) {
			num1[i]=arr[count1-1-i];
		}

		num2=new int[count2];
		for(int i=0;i<count2;i++) {
			num2[i]=arr[i+count1+zero];
		}
		int newk=K-zero;
		if(count1>0) {		
			if(newk<=count1) {
				result1=-num1[newk-1];
			}
		}
		if(count2>0) {			
			if(newk<=count2) {
				result2=num2[newk-1];
			}
		}
		if(count1>0||count2>0) {
		min=Math.min(result1, result2);
		}
		int x=Math.min(count1,newk)-1,y=Math.min(count2,newk)-1;
		if(count1>0&count2>0){
			for(int i=x;i>=-1&(newk-2-i)<=y;i--) {	
				if(newk-2-i<0) {
					result=-num1[i];
				}else if(i<0) {
					result=num2[newk-2-i];
				}else {
					result1=-num1[i]*2+num2[newk-2-i];
					result2=-num1[i]+num2[newk-2-i]*2;
					result=Math.min(result1, result2);
				}
				if(result<min) {
					min=result;
				}			
			}
		}		
		System.out.println(min);							
		sc.close();
	}
}