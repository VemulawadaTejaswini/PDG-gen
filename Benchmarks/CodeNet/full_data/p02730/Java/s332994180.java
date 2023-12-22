import java.util.*;
public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		String S = sc.next();
		String ans="Yes";
		//回分判定1
		for(int i=1;i<=(S.length());i++){
			if(S.charAt(i-1)==S.charAt(S.length()-i)){
			}
			else{
			ans="No";
			}
		}
		//回分判定2
		for(int i=1;i<=(S.length()-1)/2;i++){
			if(S.charAt(i-1)==S.charAt(((S.length()-1)/2)-i)){
			}
			else{
			ans="No";
			}
		}
		//回分判定3
		for(int i=(S.length()+3)/2;i<=(S.length());i++){
			if(S.charAt(i-1)==S.charAt(((S.length()+3)/2)+(S.length())-i-1)){
			}
			else{
			ans="No";
			}
		}
		System.out.println(ans);
        }
    }