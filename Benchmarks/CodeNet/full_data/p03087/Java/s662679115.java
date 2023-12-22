import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int q=sc.nextInt();
		String s = sc.next();
		char c[] = s.toCharArray();

int l,r;
int ans;
for(int i=1;i<=q;i++){
ans=0;
	l=sc.nextInt();
r=sc.nextInt();
l--;
r--;
for(int j=l;j<=r-1;j++){
if(c[j]=='A'&&c[j+1]=='C'){
	ans++;
}
}
System.out.println(ans);
}


	}
}