import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		int ans=s.length();
		int count0=0;
		int count1=0;
		int count2=1;
		int b=0;
		int count3=0;
		int st=0;
		char a='2';
		for(int i = 0; i<s.length(); i++){
			if(i!=0){
				if(a==s.charAt(i)){
					count2++;
				}else{
					count3++;
					st+=count2;
					if(count3==2){
						ans=Math.min(ans,st);
						count3=1;
						st=count2;
					}
					count2=1;
					b++;
				}
			}
			if(s.charAt(i)=='1'){
				count1++;
			}else{
				count0++;
			}
			a=s.charAt(i);
		}
		if(b<2){
			System.out.println(Math.max(count1, count0));
		}else{
			System.out.println(Math.min(ans,st+count2));
		}
	}
}