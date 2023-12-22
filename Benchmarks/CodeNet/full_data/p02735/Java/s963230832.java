import java.util.Scanner;

/*
AGC043A
*/

public class Main {
    public static void main(String[] args){

        Scanner s = new Scanner(System.in);
        int h = s.nextInt();
        int w = s.nextInt();
        int need = h + w;
        int count = 0;

        String row[] = new String[h];

        String all[][] = new String[h][w];
        int  hmax = 0;
        int  wmax = 0;

        for (int i = 0; i < h; i++) {
            row[i] = s.next();

            all[i] = row[i].split("");
            int htemp = 0;

            for (int j = 0; j < w; j++) {        
                if (all[i][j].equals(".")) {
                    htemp++;
                }
                if (htemp > hmax) {
                    hmax = htemp;
                }
            }
        }

        for (int i = 0; i < w; i++) {
            int wtemp = 0;

            for (int j = 0; j < w; j++) {
                if (all[j][i].equals(".")) {
                    wtemp++;
                }
                if (wtemp > wmax) {
                    wmax = wtemp;
                }
            }
        }

        if (need > (hmax + wmax)) {
            count = need - (hmax + wmax);
        }

        if (all[0][0] == "#") {
            count++;
        }
        if (all[h-1][w-1] == "#") {
            count++;
        }

        System.out.println(count);
    }
}