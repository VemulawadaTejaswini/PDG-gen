import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main (String[] args) {

		Main main = new Main ();
		main.solve();
	}

	private void solve() {

		Scanner sc = new Scanner (System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();

		int time =0;

		int ar = a%10;
		int br = b%10;
		int cr = c%10;
		int dr = d%10;
		int er = e%10;

		int[] list = new int[5];

		if (ar==0) {
			list[0]=9;
		} else {
			list[0]=ar;
		}

		if (br==0) {
			list[1]=9;
		} else {
			list[1]=br;
		}

		if (cr==0) {
			list[2]=9;
		} else {
			list[2]=cr;
		}

		if (dr==0) {
			list[3]=9;
		} else {
			list[3]=dr;
		}

		if (er==0) {
			list[4]=9;
		} else {
			list[4]=er;
		}

		Arrays.sort(list);
		int[] list2 = new int [5];
		if (list[0]==ar) {
			list2=check('a',a,b,c,d,e);
		} else if (list[0]==br) {
			list2=check('b',a,b,c,d,e);
		} else if (list[0]==cr) {
			list2=check('c',a,b,c,d,e);
		} else if (list[0]==dr) {
			list2=check('d',a,b,c,d,e);
		} else if (list[0]==er){
			list2=check('e',a,b,c,d,e);
		} else {
			list2 = check ('1',a,b,c,d,e);
		}

		for (int index=0; index<5; index++) {
			time+=list2[index];
		}

		System.out.println(time);
	}

	private int[] check (char ch, int a, int b, int c, int d, int e) {

		int[] list2 = new int [5];

		switch (ch) {

		case 'a':
			if (b%10!=0) {
				b-=b%10;
				b+=10;
			}
			if (c%10!=0) {
				c-=c%10;
				c+=10;
			}
			if (d%10!=0) {
				d-=d%10;
				d+=10;
			}
			if (e%10!=0) {
				e-=e%10;
				e+=10;
			}
			break;
		case 'b':
			if (a%10!=0) {
				a-=a%10;
				a+=10;
			}
			if (c%10!=0) {
				c-=c%10;
				c+=10;
			}
			if (d%10!=0) {
				d-=d%10;
				d+=10;
			}
			if (e%10!=0) {
				e-=e%10;
				e+=10;
			}
			break;

		case 'c':
			if (a%10!=0) {
				a-=a%10;
				a+=10;
			}
			if (b%10!=0) {
				b-=b%10;
				b+=10;
			}
			if (d%10!=0) {
				d-=d%10;
				d+=10;
			}
			if (e%10!=0) {
				e-=e%10;
				e+=10;
			}
			break;
		case 'd':
			if (a%10!=0) {
				a-=a%10;
				a+=10;
			}
			if (b%10!=0) {
				b-=b%10;
				b+=10;
			}
			if (c%10!=0) {
				c-=c%10;
				c+=10;
			}
			if (e%10!=0) {
				e-=e%10;
				e+=10;
			}
			break;
		case 'e':
			if (a%10!=0) {
				a-=a%10;
				a+=10;
			}
			if (b%10!=0) {
				b-=b%10;
				b+=10;
			}
			if (c%10!=0) {
				c-=c%10;
				c+=10;
			}
			if (d%10!=0) {
				d-=d%10;
				d+=10;
			}
			break;

			default:
		}

		list2[0]=a;
		list2[1]=b;
		list2[2]=c;
		list2[3]=d;
		list2[4]=e;
		return list2;
	}
}
