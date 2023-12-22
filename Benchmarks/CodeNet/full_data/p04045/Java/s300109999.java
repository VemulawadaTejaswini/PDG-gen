import java.util.*;

class Main {

	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);
		int price,n;
		price = scan.nextInt();
		n = scan.nextInt();
		ArrayList<Integer> ok = new ArrayList<Integer>();

		for(int i = 0; i < 10; i++)ok.add(i);

		int buf;

		for(int i = 0; i < n; i++){
			buf = scan.nextInt();
			ok.remove(buf-i);
		}

		int ans = 0;
		int one,count = 0;
		Boolean flag = false;

		while(price > 0){
			one = price % 10;
			for(int i = 0;i < ok.size(); i++){
				if(one == ok.get(i)){
					ans += ok.get(i) * ((int)Math.pow(10, count));
					flag = true;
					break;
				}
				if(one < ok.get(i)){
					ans = ok.get(i) * ((int)Math.pow(10, count));
					flag = true;
					break;
				}
			}
			if(flag){
				price /= 10;
				count++;
				flag = false;
			}
			else{
				ans = ok.get(0) * ((int)Math.pow(10, count));
				price /= 10;
				count++;
				price ++;
			}
		}
		System.out.print(ans);
	}
}