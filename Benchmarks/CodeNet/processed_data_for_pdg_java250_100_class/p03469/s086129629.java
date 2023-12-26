public class Main {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
String a=scan.next();
char b[]=new char[a.length()];
for(int i=0;i!=a.length();i++) {
	char c=a.charAt(i);
	if(i==3) {
		c='8';
	}
	b[i]=c;
}
for(int i=0;i!=a.length();i++) {
	System.out.print(b[i]);
}
System.out.println();
	}
}
