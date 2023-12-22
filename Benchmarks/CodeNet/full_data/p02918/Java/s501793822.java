import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		String s=sc.next();
		char p=s.charAt(0);
		int count=0;
		int countk=1;
		for(int i=1; i<n; i++){
			if(p==s.charAt(i)){
				count++;
			}else{
				countk++;
				p=s.charAt(i);
			}
		}
		if(countk/2<=k){
			System.out.println(n-1);
		}else{
			System.out.println(count+k*2);
		}
		
	}
}
