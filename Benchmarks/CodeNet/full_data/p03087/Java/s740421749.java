import java.util.Scanner;

class Main{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int q = sc.nextInt();
		String str = sc.next();
		char c[] = new char[n];
		for(int i = 0; i < n; i++){
			c[i] = str.charAt(i);
		}
		
		for(int i = 0; i < q; i++){
			int l = sc.nextInt();
			int r = sc.nextInt();
			boolean hantei = false;
			int answer = 0;
			for(int j = l; j <= r; j++){
				if(c[j-1] == 'A'){
					hantei = true;
				}else if(hantei){
					if(c[j-1] == 'C'){
						answer += 1;
					}
				}else{
					hantei = false;
				}
			}
			System.out.println(answer);
		}
	}
}