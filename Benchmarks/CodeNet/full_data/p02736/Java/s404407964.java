import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
        StringBuffer sb = new StringBuffer(scan.next());
        StringBuffer temp = new StringBuffer("");
		
        while(sb.length()!=1){
			temp = new StringBuffer("");
		for(int i = 0; i < sb.length()-1; i++){
			temp.append(Math.abs((int)(sb.charAt(i)-'0') - (int)(sb.charAt(i+1) - '0')));
		}
		sb = new StringBuffer(temp.toString());
        }

		System.out.println(sb);
	}
}