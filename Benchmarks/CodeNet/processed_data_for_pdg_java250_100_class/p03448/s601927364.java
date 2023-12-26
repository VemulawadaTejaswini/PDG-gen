public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int cnt = 0;
		int gohyaku = sc.nextInt();
		int hyaku = sc.nextInt();
		int goju = sc.nextInt();
		int x = sc.nextInt();
        for(int i = 0; i <= gohyaku; i++){
            for(int j = 0; j <= hyaku; j++){
                for(int k = 0; k <= goju; k++){
                    int ans = 500*i + 100*j + 50*k;
                    if(x==ans){
                        cnt++;
                    }
                }
            }
        }
        System.out.println(cnt);
	}
}
