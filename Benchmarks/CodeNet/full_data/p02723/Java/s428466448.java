    import java.io.PrintWriter;
    import java.util.Arrays;
    import java.util.Scanner;
     
    /*
     * To change this license header, choose License Headers in Project Properties.
     * To change this template file, choose Tools | Templates
     * and open the template in the editor.
     */
    /**
     *
     * @author i.mekni
     */
    public class Main {
     
        /**
         * @param args the command line arguments
         */
        public static void main(String[] args) {
            // TODO code application logic here
     
            Scanner read = new Scanner(System.in);
     
            PrintWriter write = new PrintWriter(System.out);
     
            int x = read.nextInt();
            int y = read.nextInt();
            int a = read.nextInt();
            int b = read.nextInt();
            int c = read.nextInt();
     
            int aTe[] = new int[a];
            int bTe[] = new int[b];
            int cTe[] = new int[c];
            for (int i = 0; i < a; i++) {
                aTe[i] = read.nextInt();
            }
     
            for (int i = 0; i < b; i++) {
                bTe[i] = read.nextInt();
            }
     
            for (int i = 0; i < c; i++) {
                cTe[i] = read.nextInt();
            }
     
            Arrays.sort(aTe);
            Arrays.sort(bTe);
            Arrays.sort(cTe);
     
            int minA = a - x;
            int minB = b - y;
     
            for (int i = 1; i <= c; i++) {
                if (minA < a && minB < b && aTe[minA] < bTe[minB]) {
                    if (cTe[c - i] > aTe[minA]) {
                        aTe[minA] = cTe[c - i];
                        minA++;
                    }
                } else {
                    if (minB < b && cTe[c - i] > bTe[minB]) {
                        bTe[minB] = cTe[c - i];
                        minB++;
                    }
                }
            }
     
            long d = 0;
     
            for (int i = 1; i <= x; i++) {
                d += aTe[a - i];
            }
     
            for (int i = 1; i <= y; i++) {
                d += bTe[b - i];
            }
     
            write.println(d);
            write.close();
        }
     
    }