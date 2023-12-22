import java.util.Scanner;
class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt(){return Integer.parseInt(s.next());};
	public static void main(String[]$){
		int[]v=s.next().chars().map(i->i-'0').toArray();
		int a=v[0];
		int b=v[1];
		int c=v[2];
		int d=v[3];

		if(a+b+c+d==7) {o("+","+","+",a,b,c,d);return;}
		if(a-b+c+d==7) {o("-","+","+",a,b,c,d);return;}
		if(a+b-c+d==7) {o("+","-","+",a,b,c,d);return;}
		if(a+b+c-d==7) {o("+","+","-",a,b,c,d);return;}
		if(a-b-c+d==7) {o("-","-","+",a,b,c,d);return;}
		if(a-b+c-d==7) {o("-","+","-",a,b,c,d);return;}
		if(a+b-c-d==7) {o("+","-","-",a,b,c,d);return;}
		if(a-b-c-d==7) {o("-","-","-",a,b,c,d);return;}
	}
	static void o(String s1,String s2,String s3,int a,int b,int c,int d){
		System.out.println(a+s1+b+s2+c+s3+d+"=7");
	}
}
