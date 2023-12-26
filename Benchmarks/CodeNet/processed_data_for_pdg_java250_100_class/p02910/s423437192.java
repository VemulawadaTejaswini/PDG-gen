public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.next();
		char[]a=S.toCharArray();
		int n=0;
		for(int i=0;i<S.length();i++){
			if(i%2==0){
				if(a[i]=='L'){
					n++;
				}
			}else{
				if(a[i]=='R'){
					n++;
				}
			}
		}
		if(n==0){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
}
