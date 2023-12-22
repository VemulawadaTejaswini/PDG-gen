import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		String t=sc.next();
		int[][] kk=new int[26][s.length()];
		for(int i=0; i<26; i++){
			int k=s.length();
			for(int j=s.length()-1; j>=0; j--){
				if(s.charAt(j)-'a'==i){
					if(j==0){
						k=j;
					}else{
						kk[i][j]=k;
						k=j;
						continue;
					}
				}
				kk[i][j]=k;
			}
		}
		int c=0;
		int count=0;
		for(int i=0; i<t.length(); i++){
			if(c==0 && kk[t.charAt(i)-'a'][0]==s.length()){
				System.out.println(-1);
				return;
			}
			c=kk[t.charAt(i)-'a'][c];
			if(c==s.length()){
				count++;
				c=0;
				i--;
			}
		}
		System.out.println(count*s.length()+c+1);
	}
}
