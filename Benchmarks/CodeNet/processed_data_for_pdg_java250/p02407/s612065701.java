public class Main {
	public static void main(String []args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] list = new int[n];
		for(int i = 0; i<n; i++){
			list[i] = sc.nextInt();
		}
		for(int i = n-1 ; 0 <= i ; i--){
			if(i==0){
				System.out.println(list[i]);
			}else{
				System.out.print(list[i] + " ");
			}
		}
	}
}
