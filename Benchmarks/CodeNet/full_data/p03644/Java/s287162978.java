import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n == 1) {
            System.out.println(1);
            System.exit(0);
        }

        int count = 0;
        int tmpCount = 0;
        int outputNum = 0;

        for(int i=n; i>0; i--) {
            if(i % 2 == 0) {
                int tmp = i;
                while(true) {
                    if(tmp % 2 == 0) {
                        tmp /= 2;
                        tmpCount++;
                    } else {
                        break;
                    }
                }
                if(count < tmpCount) {
                    outputNum = i;
                    count = tmpCount;
                }
            }
            tmpCount = 0;
        }
        System.out.println(outputNum);
    }
}
