import java.util.Scanner;

public class Main {

	private static int[] gs = new int[]{100,101,102,103,104,105};

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		sc.close();

		for(int i0 = 1;i0 < X/100;i0++){
			for(int i1 = 1;i1 < X/101;i1++){
				for(int i2 = 1;i2 < X/102;i2++){
					for(int i3 = 1;i3 < X/103;i3++){
						for(int i4 = 1;i4 < X/104;i4++){
							for(int i5 = 1;i5 < X/105;i5++){
								if(gs[0]* i0 + gs[1] * i1 + gs[2] * i2 + gs[3] * i3 + gs[4] * i4 + gs[5] * i5 == X){
									System.out.println(1);
									return;
								}
							}
						}
					}
				}
			}
		}
		System.out.println(0);
	}
}