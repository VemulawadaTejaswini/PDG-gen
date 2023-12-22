import java.util.Scanner;
public class Main {

	public static void main(String[] args)throws Exception {
		Scanner stdIn=new Scanner(System.in);
		int N=stdIn.nextInt();
		int a[][]=new int[200][200];
		int z=1,y=0,x=1,w=1;
		int key=0;
		while(true) {
			if((z*(z+1))/2==N) {
				key=z;
				break;
			}
			if((z*(z+1))/2>N)
				break;
			z++;
		}z=0;
		if(key==0)
			System.out.println("No");
		else {
			while(z<key) {
				while(y<key) {
					a[z][y]=x;
					a[y+1][z]=x;
					x++;y++;
				}
				z++;
				y=w;
				w++;
			}z=0;y=0;x=0;
			System.out.println("Yes");
			System.out.println(key+1);
			while(z<key+1) {
				System.out.print(key);
				while(y<key) {
					System.out.print(a[z][y]);
					y++;
				}y=0;
				System.out.println();
				z++;
			}
		}
	}
}