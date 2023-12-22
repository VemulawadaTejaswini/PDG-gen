import java.util.Scanner;

class Main{
	static Scanner s=new Scanner(System.in);
	static int gInt() {return Integer.parseInt(s.next());}
	static long gLong() {return Long.parseLong(s.next());}

	public static void main(String[]$){
		int r=0,i=gInt(),a=gInt(),b=gInt(),d;
		for(;i>0;--i) {
			d=(""+i).chars().map(v->v-'0').sum();
			if(a<=d&&d<=b)
				r+=i;
		}
		System.out.println(r);
	}
}