public class Main {
static long[] list=new long[87];
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
   String[] s=sc.nextLine().split(" ");
int A=Integer.parseInt(s[0]);
int B=Integer.parseInt(s[1]);
String C=s[0]+s[1];
int num=Integer.parseInt(C);
int hei=(int)Math.sqrt(num);
if(num==hei*hei)
System.out.println("Yes");
else
System.out.println("No");
}
}
