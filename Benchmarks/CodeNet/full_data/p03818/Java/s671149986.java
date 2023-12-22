import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] x=new int[100001];
		for(int i=0;i<n;i++){
			x[sc.nextInt()]++;
		}
		int sum=0,num=0;
		for(int i=0;i<x.length;i++){
			if(x[i]>=3 && x[i]%2!=0){
				x[i]=1;
			}else if(x[i]>=3 && x[i]%2==0)
				x[i]=2;
			if(x[i]==2)
				num++;
			if(x[i]>0)
				sum++;
		}
		if(num%2!=0)
			sum--;
		System.out.print(sum);
	}
}
