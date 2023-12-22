

import java.util.Scanner;

/**
 *
 * @author cs18097
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int menber = sc.nextInt();
        int change = sc.nextInt();
        String mapcode = sc.next();
        String[] map = mapcode.split("");
        String[] magic = new String[change * 2];
        int[] golem = new int[menber];
        int count = 0;
        for (int n = 0; n < menber; n++) {
            golem[n] = 1;
        }
        for (int i = 0; i < change * 2; i++) {
            magic[i] = sc.next();
        }

        for (int s = 0; s < change; s++) {//魔法の回数
            for (int t = 0; t < menber; t++) {//ゴーレムの場所について
                if (map[t].equals(magic[s * 2])) {//魔法の指示とマップの文字が同じとき
                    if ("L".equals(magic[s * 2 + 1])) {
                        if (t == 0) {
                            golem[0] = 0;
                        }
                        if (t != 0 ) {
                            golem[t - 1] += golem[t];
                        }

                    } else if ("R".equals(magic[s * 2 + 1])) {
                        
                        if (t== menber) {
                            golem[menber - 1] = 0;
                        }
                        if (t != menber - 1 ) {
                            golem[t + 1] += golem[t];
                        }

                    }
                    golem[t] = 0;
                }
            }
        }
        for (int k = 0; k < menber; k++) {
            count += golem[k];
        }
        System.out.print(count);

    }
}
