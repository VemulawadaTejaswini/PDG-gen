public class Main {
	Scanner sc = new Scanner(System.in);
	int a,b,c,d,e,f,k,n,m,x,y,z;
	long[] ans;
	String[] S;
	long num = 100000;
	Main(){
		n = sc.nextInt();
		ans = new long[n];
		for(int i=0;i<n;i++){
			ans[i]=i+sc.nextLong()*num;
		}
		Arrays.sort(ans);
		for(long l:ans){
			System.out.println(l%num+1);
		}
	}
	public static void main(String[] args){
		new Main();
	}
}
