import java.util.Scanner;
public class Main {
@SuppressWarnings("resource")
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int ans=0;
	String buf;
	String buf1[]=new String[3];
	String buf2[]=new String[3];

	buf=sc.next();
	buf1=buf.split("");
	buf=sc.next();
	buf2=buf.split("");
	for(int i=0;i<3;i++) {
		if(buf1[i].equals(buf2[i]))
			ans++;
	}
	System.out.println(ans);
}
}
