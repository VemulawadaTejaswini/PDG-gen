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
		int r=l/2*2+j/2*2+i/2*2;
		if(l>0&&j>0&&i>0)
			r=Math.max(r,3+(l-1)/2*2+(j-1)/2*2+(i-1)/2*2);
		System.out.println(r+o);
	}
}