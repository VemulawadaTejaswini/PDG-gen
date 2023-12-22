import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();

		int r[]=new int[a];


		int eat=999999999;
		for(int i=0;i<=a-1;i++){

	r[i]=i+b;
if(Math.abs(eat)>Math.abs(r[i])){
	eat=r[i];
}
}


System.out.println(sum(r)-eat);




	}
	static int sum(int a[]){
		int n=a.length;
		int ans=0;
		for(int i=0;i<=n-1;i++){
			ans+=a[i];
		}
	return ans;
		}

}