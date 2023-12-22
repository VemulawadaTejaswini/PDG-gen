import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	static final int A = (int)Math.pow(10, 9) + 7;
	static int ans;
	public static void main(String args[]){
		run();
	}
	static void run(){
		Scanner scan = new Scanner(System.in);
		int n;
		ans = 0;
		n = scan.nextInt();
		ArrayList<Integer> diff = new ArrayList<Integer>();
		for(int i = 0; i < n; i++){
			diff.add(scan.nextInt());
		}
		boolean flag;
		flag = false;
		flag = check(n, diff);
		flag = overrap(n, diff);
		if(flag){
			System.out.println("0");
		}else{
			System.out.println((int)Math.pow(2, ans - 1));
		}
	}
	static boolean overrap(int n, ArrayList<Integer> diff){
		int index;
		index = 0;
		if(n % 2 != 0){
			for(int j = 0; j < diff.size(); j++){
				for(int i = 0; i < diff.size(); i++){
					if(diff.get(i) == ans * 2){
						index = i;
						break;
					}
				}
				if(diff.get(index) == 0){
					diff.remove(index);
					ans++;
					j = 0;
					continue;
				}
				for(int i = 0; i < diff.size(); i++){
					if(index == i) continue;
					if(diff.get(index) == diff.get(i)){
						diff.remove(i);
						diff.remove(index);
						ans++;
						j = 0;
						break;
					}
				}
			}
			if(diff.isEmpty()){
				return false;
			}else{
				return true;
			}			
		}else{
			for(int j = 0; j < diff.size(); j++){
				for(int i = 0; i < diff.size(); i++){
					if(diff.get(i) == ans * 2 + 1){
						index = i;
						break;
					}
				}
				for(int i = 0; i < diff.size(); i++){
					if(index == i) continue;
					if(diff.get(index) == diff.get(i)){
						diff.remove(i);
						diff.remove(index);
						ans++;
						j = 0;
						break;
					}
				}
			}
			if(diff.isEmpty()){
				ans++;
				return false;
			}else{
				return true;
			}
		}
	}
	static boolean check(int n, ArrayList<Integer> diff){
		if(n % 2 ==0){
			for(int i = 0; i < n; i++){
				if(diff.get(i) % 2 != 0){
					return true;
				}
			}
		}else{
			for(int i = 0; i < n; i++){
				if(diff.get(i) % 2 == 0){
					return true;
				}
			}
		}
		return false;
	}
}
