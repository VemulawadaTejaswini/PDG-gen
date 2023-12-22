import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	//U=0, R=1, D=2, L=3
	public void run() {
		Scanner sc = new Scanner(System.in);
		int sx=sc.nextInt();
		int sy=sc.nextInt();
		int tx=sc.nextInt();
		int ty=sc.nextInt();
		int dx=tx-sx;
		int dy=ty-sy;
		StringBuilder sb = new StringBuilder();



		char cy = 'U';
		if(dy<0) {
			cy='D';
			dy = -dy;
		}

		char cx='R';
		if(dx<0) {
			cx='L';
			dx=-dx;
		}


		for(int i=0,j=0; ;) {
			if(i==dy&j==dx) {
				break;
			}
			if(dy-i>1) {
				sb.append(cy);
				sb.append(cy);
				i+=2;
			}
			else if(dy-i==1) {
				sb.append(cy);
				i++;
			}
			if(dx-j>1) {
				sb.append(cx);
				sb.append(cx);
				j+=2;
			} else if(dx-j==1) {
				sb.append(cx);
				j++;
			}

		}

		String base = sb.toString();

		sb.setLength(0);

		for(int i=0; i<base.length(); i++) {
			if(base.charAt(i)=='U') {
				sb.append('D');
			} else if(base.charAt(i)=='D'){
				sb.append('U');
			} else if(base.charAt(i)=='L'){
				sb.append('R');
			} else {
				sb.append('L');
			}
		}
		String rev = sb.toString();

		sb.setLength(0);

		String base2 = "LU"+base+"RD";
		String rev2 = "RD"+rev+"LU";
		System.out.println(base+rev+base2+rev2);
		sc.close();
	}
}
