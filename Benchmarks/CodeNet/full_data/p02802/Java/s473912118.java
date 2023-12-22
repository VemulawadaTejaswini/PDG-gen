import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int acc = 0;
        int pc = 0;
        int[] wa = new int[n];
        boolean[] ac = new boolean[n];
        for(int i=0; i<m; i++) {
            int a = sc.nextInt() - 1;
            String res = sc.next();
            if(ac[a]) {
                continue;
            }
            if(res.equals("AC")) {
                acc++;
                pc+=wa[a];
                ac[a] = true;
            } else {
                wa[a]++;
            }
        }
        System.out.println(String.format("%d %d", acc, pc));


    }

}
