import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		long k = sc.nextLong();
		StringBuffer sb=new StringBuffer();
		for(int i = 0; i<s.length()-1; i++){
			if((26-(s.charAt(i)-'a'))<=k){
				k-=26-(s.charAt(i)-'a');
				sb.append("a");
			}else{
				sb.append(s.charAt(i));
			}
		}
		if(k>0){
			char t=s.charAt(s.length()-1);
			if((k/26)>0){
				sb.append((char)(t+(k%26)));
			}else{
				sb.append((char)(t+k));
			}
		}
		System.out.println(sb);
	}
}
