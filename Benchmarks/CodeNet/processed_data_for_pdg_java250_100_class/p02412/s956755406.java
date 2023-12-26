public class Main {
	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 int n;	
		 int x;	
		 int cnt;	
		 while(true){
			 n = Integer.parseInt(scan.next());
			 x = Integer.parseInt(scan.next());
			 cnt = 0;
			 if(x == 0 && n == 0){
				 break;
			 }else{
				 for(int i = 1; i <= n; i++ ){
					 for(int l = i + 1; l <= n; l++ ){
						 for(int k = l + 1; k <= n; k++ ){
							 if((i + l + k) == x){
								 cnt++;
							 }
						 }
					 }
				 }
		 }
			 System.out.println(cnt);
		 }
	}
}
