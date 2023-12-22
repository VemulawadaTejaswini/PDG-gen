import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		//B
		int H = sc.nextInt();
		int W = sc.nextInt();
		ArrayList<String> ans = new ArrayList<>();
		String[] depths = new String[W];
		for(int i = 0 ; i < H ; i++){
			String tmp = sc.next();
			if(tmp.contains("#")){
				ans.add(tmp);
				for(int j = 0 ; j < W ; j++){
					depths[j] += tmp.charAt(j);
				}
			}
		}
		for(int i = 0 ; i < W ; i++){
			if(!depths[i].contains("#")){
				for(int j = 0 ; j < ans.size() ; j++){
					String s = ans.get(j).substring(0,i)+ans.get(j).substring(i+1);
					ans.set(j,s);
				}
			}
		}
		for(String s : ans){
			System.out.println(s);
		}
	}
}