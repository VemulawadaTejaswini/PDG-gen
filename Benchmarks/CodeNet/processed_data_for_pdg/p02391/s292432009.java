class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
String A=scan.next();
String B=scan.next();
int a=Integer.parseInt(A);
int b=Integer.parseInt(B);
if(a<b)
System.out.println("a < b");
else if(a>b)
System.out.println("a > b");
else
System.out.println("a == b");
}
}
