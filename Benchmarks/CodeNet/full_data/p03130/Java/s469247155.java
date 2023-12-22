import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            int[] p = new int[4];
            for (int i = 0; i < 6; i++) {
                int a = in.nextInt();
                p[a - 1] ++;
            }
            int i;
            for (i = 0; i < 4; i++) {
                if(p[i] > 2 || p[i] == 0){
                    break;
                }
            }
            if(i == 4){
                System.out.println("YES");
            }else{
                System.out.println("N0");
            }
        }
    }
}