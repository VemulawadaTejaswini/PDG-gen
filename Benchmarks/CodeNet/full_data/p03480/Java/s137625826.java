import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int count0=0;
		int count1=0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)=='1'){
				count1++;
			}else{
				count0++;
			}
		}
		System.out.println(Math.max(count0,count1));
	}
}