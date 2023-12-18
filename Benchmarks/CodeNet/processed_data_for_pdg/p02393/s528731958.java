public class Main {
	public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
int a=scan.nextInt();
int b=scan.nextInt();
int c=scan.nextInt();
int d=0;
int e=0;
int f=0;
if(a>=b&&b>=c){
	d=a;
	e=b;
	f=c;
}
if(a>=c&&c>=b){
	d=a;
	e=c;
	f=b;
}
if(b>=a&&a>=c){
	d=b;
	e=a;
	f=c;
}
if(b>=c&&c>=a){
	d=b;
	e=c;
	f=a;
}
if(c>=a&&a>=b){
	d=c;
	e=a;
	f=b;
}
if(c>=b&&b>=a){
	d=c;
	e=b;
	f=a;
}
System.out.println(f+" "+e+" "+d);
	}
}
