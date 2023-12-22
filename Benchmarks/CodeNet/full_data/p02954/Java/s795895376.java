import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s=sc.next();
		int[] ans=new int[s.length()];
		int count=1;
		int in=0;
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i)=='L' && s.charAt(i+1)=='R'){
				ans[in]=count;
				count=1;
				continue;
			}
			if(s.charAt(i)=='R' && s.charAt(i+1)=='L'){
				ans[i]=count;
				in=i+1;
				count=1;
			}else{
				count++;
			}
		}
		ans[in]=count;
		for(int i=0; i<s.length()-1; i++){
			if(s.charAt(i)=='R' && s.charAt(i+1)=='L'){
				if(ans[i]!=ans[i+1]){
					int t=(ans[i]+ans[i+1])/2;
					int y=ans[i]+ans[i+1]-t;
					if(ans[i]>ans[i+1]){
						if(ans[i]%2==0){
							ans[i]=t;
							ans[i+1]=y;
						}else{
							ans[i]=y;
							ans[i+1]=t;
						}
					}else{
						if(ans[i+1]%2==0){
							ans[i+1]=t;
							ans[i]=y;
						}else{
							ans[i+1]=y;
							ans[i]=t;
						}
					}
				}
			}
			System.out.print(ans[i]+" ");
		}
		System.out.print(ans[s.length()-1]);
	}
}
