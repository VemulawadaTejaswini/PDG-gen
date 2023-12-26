public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int[]H=new int[N];
		for(int i=0;i<H.length;i++){
			H[i]=sc.nextInt();
	}
		sc.close();
		int ans=1;
		int max=H[0];
		for(int i=1;i<H.length;i++){
			if(max<=H[i]){
				max=H[i];
				ans++;
			}
		}System.out.println(ans);
	}
}
