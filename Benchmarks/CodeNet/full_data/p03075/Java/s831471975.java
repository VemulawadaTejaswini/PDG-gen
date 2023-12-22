import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int[] antenas = {
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt(),
            sc.nextInt()
        };
        int dist = sc.nextInt();
        boolean res = true;
        for (int i = 0;i < antenas.length - 1;i++) {
            for (int j = i; j + i < antenas.length - 1; j++) {
                if (antenas[j+1] - antenas[i] > dist) {
                    res = false;
                    break;
                }
            }
            if (!res) break;
        }
        
        System.out.println(res ? "Yay!" : ":(");
    }
}
