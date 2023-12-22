import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
String s=sc.next();
int mode;
char c[]=s.toCharArray();
if(c[0]=='W'){mode=1;}else{mode=2;}

int che=0;
for(int i=1;i<=s.length()-1;i++){
if(mode==1&&c[i]=='B'){
	che++;
	mode=2;
}

if(mode==2&&c[i]=='W'){
	che++;
	mode=1;
}
}
System.out.println(che);
	}}