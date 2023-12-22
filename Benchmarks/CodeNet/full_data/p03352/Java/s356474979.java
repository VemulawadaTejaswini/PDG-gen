import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if(x==1) {
			System.out.println(1);
		}else if(x==2) {
			System.out.println(2);
		}else if(x==3) {
			System.out.println(3);
		}else {
			for(int i=0; x-i>=2;i++) {
				if(isPower(x-i)>=2) {
					System.out.println(isPower(x-i));
					break;
				}
			}
		}
	}

    public static int isPower(int num) {
        for (int n = 2; Math.pow(num, 1.0 / n) >= 2.0; n++) {
            double nThRoot = Math.pow(num, 1.0 / n);
            if (nThRoot - Math.floor(nThRoot) == 0.0)
                return (int)Math.pow(nThRoot, n);
        }
        return -1;
    }
}
