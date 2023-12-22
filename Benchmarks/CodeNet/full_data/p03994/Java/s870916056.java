import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		StringBuffer sb=new StringBuffer();
		for(int i = 0; i<s.length(); i++){
			if((26-(s.charAt(i)-'a'))<=k){
				k-=26-(s.charAt(i)-'a');
				sb.append("a");
			}else{
				sb.append(s.charAt(i));
			}
		}
		System.out.println(sb);
	}
}
