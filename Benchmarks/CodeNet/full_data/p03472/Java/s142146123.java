public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int hp = sc.nextInt();
		int a = 0;
		int b[] = new int [n];
		for(int i = 0; i < n ; i++){
			int tmp = sc.nextInt();
			if( tmp > a){
				a = tmp;
			}
			b[i] = sc.nextInt();
		}
		for( int i = n; i > 0; i--){
			for( int j = 0; j < i - 1 ; j++ ){
				if(b[j] < b[j+1]){
					int tmp = b[j];
					b[j] = b[j+1];
					b[j+1] = tmp;
				}
			}
		}
		int ans = 0;
		int index = 0;
		while( hp > 0){
			if( index < n && b[index] >= a ){
				hp -= b[index];
				ans++;
				index++;
			}else{
				hp -= a;
				ans++;
			}
		}
		System.out.print(ans);
	}
}
