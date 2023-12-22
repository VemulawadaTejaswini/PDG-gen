import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String s = scanner.next();
            char [] sar = s.toCharArray();
            int [] step = new int[8000];
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int nx = 0;
            int ny =0;
            char dir = 'x';
            for (int i=0; i<sar.length; i++){
                if (sar[i] == 'F'){
                    if (dir == 'x') nx++;
                    else ny++;
                } else if (sar[i] == 'T') {
                    if (dir == 'x') dir = 'y';
                    else  dir ='x';
                }
            }
            Boolean rslt = false;
            for(int i=-nx; i<=nx; i=i+2){
                if (i == x) {
                    for (int j=-ny; j<=ny; j=j+2){
                        if (j == y) rslt = true;
                    }
                }
            }
            if (rslt) System.out.println("Yes");
            else System.out.println("No");
        }
}