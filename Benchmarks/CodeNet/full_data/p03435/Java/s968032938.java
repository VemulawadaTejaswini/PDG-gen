import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] c = new int[9];
        for(int i=0; i<9; i++) {
            c[i] = sc.nextInt();
        }

        boolean[] isExisted = new boolean[9];
        for(int i=0; i<c.length-1; i++) {
            for(int j=1; j<c.length; j++) {
                if(i == j) continue;
                int sum = c[i]+c[j];
                for(int k=0; k<c.length; k++) {
                    if(sum == c[k] && !isExisted[k]) {
                        isExisted[k] = true;
                    }
                }
            }
        }
        for(int i=0; i<isExisted.length; i++) {
            if(isExisted[i] == false) {
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}
