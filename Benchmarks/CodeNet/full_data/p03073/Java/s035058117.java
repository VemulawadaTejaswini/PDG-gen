import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String tile = sc.next();
		int cnt0 = 0;
		int cnt1 = 0;
		for(int i = 0; i < tile.length(); i++){
			if(i%2 == 0){
				if(tile.charAt(i) != '0'){
					cnt0++;
				}
			}
			if(i%2 == 1){
				if(tile.charAt(i) != '1'){
					cnt0++;
				}
			}
			if(i%2 == 0){
				if(tile.charAt(i) != '1'){
					cnt1++;
				}
			}
			if(i%2 == 1){
				if(tile.charAt(i) != '0'){
					cnt1++;
				}
			}
		}
		System.out.println(Math.min(cnt0,cnt1));
	}
}