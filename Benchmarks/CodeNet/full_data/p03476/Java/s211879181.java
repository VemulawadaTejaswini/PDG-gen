import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		ArrayList<Integer> x=new ArrayList<>();
		x.add(2);x.add(3);
		for(int i=5;i<=100000;i+=2){
			boolean can = true;
			for(int k=2;k<=i/2;k++){
				if(i%k==0){
					can = false;
					break;
				}
			}
			if(can)
				x.add(i);
		}
		int n=sc.nextInt();
		while(n-->0){
			int sum = 0;
			int a=sc.nextInt(),b=sc.nextInt();
			for(int i=a;i<=b;i+=2){
				if(x.contains(i)&&x.contains((i+1)/2)){
					sum++;
				}
			}
			System.out.println(sum);
		}
	}
}