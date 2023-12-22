import javax.sound.midi.Soundbank;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt();
        int n = in.nextInt();
        //void cp(int c,int w){for(int i=c; i<=v; i++)f[i]=max(f[i],f[i-c]+w);}
        int[] f = new int[h + 1];
        int[] a = new int[h + 1];
        int[] b = new int[h + 1];
        int mi = 100000000;
        for (int k = 0; k < n; k++) {
            a[k] = in.nextInt();
            b[k] = in.nextInt();
            mi = min(b[k], mi);
        }
        for (int i = 1; i <= h; i++) {
            f[i] = f[i - 1] + mi;
            for (int j = 0; j < n; j++) {
                if (i >= a[j])
                    f[i] = min(f[i], f[i - a[j]] + b[j]);
            }

        }
        System.out.println(f[h]);

    }
}
