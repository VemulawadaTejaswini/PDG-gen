import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int[] abc=new int[3];
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)=='a'){
				abc[0]++;
			}else if(s.charAt(i)=='b'){
				abc[1]++;
			}else{
				abc[2]++;
			}
		}
		int ans=Math.max(Math.max(Math.abs(abc[0]-abc[1]),Math.abs(abc[0]-abc[2])),Math.abs(abc[1]-abc[2]));
		if(ans<2){
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
	}
}
