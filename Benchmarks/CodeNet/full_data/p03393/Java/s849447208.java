import java.util.Scanner;

class Solver{
	Scanner sc =new Scanner(System.in);
	
	void run(){
		
		String buf = sc.next();
		
		int[] used = new int['z'+1];
		
		for(char ch:buf.toCharArray()){
			used[ch]++;
		}
		
		String res = null;
		int max = 0;
		for(int i = 'a'; i <= 'z'; i++){
			if(used[i] == 0 && res == null){
				res = buf + (char)i;
			}
			max = Math.max(used[i],max); 
		}
		
		
		if(buf.length() == 26){
			System.out.println(getNext(buf));
			return;
		}
		
		System.out.println(max == 1 ? res : "-1");
		
	}
	
	String getNext(String buf){
		char[] arr = buf.toCharArray();
		int n = 26;
		
		int used[] = new int['z'+1];
		String res = "-1";
		
		for(int i =0 ;i < n;i++){
			used[arr[i]]++;
			for(int j = arr[i]+1 ; j <= 'z';j++){
				if(used[j] == 0){
					res = buf.substring(0, i) + (char)j;
					break;
				}
			}
		}
		return res;
		
	}
}

public class Main {
	public static void main(String[] args){
		Solver s  = new Solver();
		s.run();
	}
}
