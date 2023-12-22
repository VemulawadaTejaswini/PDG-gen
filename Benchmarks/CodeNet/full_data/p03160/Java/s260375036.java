import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int h[]=new int[n+1];
		for(int i=1;i<=n;i++){
h[i]=sc.nextInt();


		}

System.out.println(Cost(1,n,h));


	}

	public static int Cost(int x,int n,int h[]){
if(x==n-1){
	return Math.abs(h[n]-h[n-1]);
}else if(x==n-2){
	return Math.min(Math.abs(h[n-1]-h[n-2])+Math.abs(h[n]-h[n-1]),Math.abs(h[n]-h[n-2]));

}else{
	return Math.min(Math.abs(h[x+1]-h[x])+Cost(x+1,n,h), Math.abs(h[x+2]-h[x])+Cost(x+2,n,h));
}
	}


}