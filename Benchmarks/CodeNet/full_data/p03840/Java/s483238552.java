import java.util.Scanner;

class Main{
	public static void main(String[]$){
		Scanner s=new Scanner(System.in);
		int
		i=s.nextInt(),
		o=s.nextInt(),
		t=s.nextInt(),
		j=s.nextInt(),
		l=s.nextInt(),
		S=s.nextInt(),
		z=s.nextInt();
		int r=0;
		r+=l/2*2;
		r+=j/2*2;
		if(l%2==1&&j%2==1&&i>0) {
			--i;
			r+=3;
		}
		System.out.println(r+i/2*2+o);
	}
}