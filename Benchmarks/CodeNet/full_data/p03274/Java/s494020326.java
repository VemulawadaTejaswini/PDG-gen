import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int K=sc.nextInt();
		int arr[]=new int[N];
		int count1=0,count2=0,zero = 0;
		int min=2147483647;
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
		int num1[]=new int[count1];
		int num2[]=new int[count2];
		for(int i=count1-1;i>=0;i--) {
			num1[i]=arr[count1-1-i];
		}
		for(int i=0;i<count2;i++) {
			num2[i]=arr[i+count1+zero];
		}
		int x=0,y=0;
		int a,b;
		if(K>count1+zero) {
			a=count1-1;
		}else {
			a=K-1-zero;
		}
		b=K-2-zero-a;
		int tmp;
		for(;a>=-1&b<count2;a--,b++) {
			if(a<0&b<0) {
				tmp=0;
			}else if(b<0&a>=0) {
				tmp=-num1[a];
			}else if(a<0&b>=0){
				tmp=num2[b];
			}else{
				tmp=-num1[a]+num2[b];
			}
			if(tmp<=min) {
				min=tmp;
				x=a;
				y=b;
			}else if(tmp==min) {
				if(a<0) {
					y=b;
				}else if(b<0){
					x=a;
				}
			}
		}
		if(x<0&y<0) {
			System.out.println(0);
		}else if(x<0&y>=0){
			System.out.println(num2[y]);
		}else if(y<0&x>=0){
			System.out.println(num1[x]);
		}else {
			System.out.println(-num1[x]>num2[y]?(-num1[x])+num2[y]*2:(-num1[x])*2+num2[y]);
		}	
		sc.close();
	}
}