import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		long M_hp = sc.nextLong();
		long count = 1;
		long attack = 1;
		int flg = 0;
		if(M_hp == 1) {
		}else {

			for(;;) {
				M_hp = M_hp/2;
				if(M_hp < 2) {
					count = count*2;
					attack = attack + count;
					break;
				}else {
					count = count*2;
					attack = attack + count;
				}

			}
		}
			System.out.println(attack);
		}
	}
