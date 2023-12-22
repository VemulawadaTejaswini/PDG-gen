import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PrintStream out = new PrintStream(System.out);

        int N, N_10[], K, D_Extra[];
        boolean E[] = {true, true, true, true, true, true, true, true, true, true};
        //{0, 1, 2, 3, 4, 5, 6, 7, 8, 9}

        N = sc.nextInt();
        K = sc.nextInt();

        N_10 = new int[5];
        D_Extra = new int[10 - K];

        //Dの値を取得
        for (int i = 0; i < K; i++) {
            E[sc.nextInt()] = false;
        }

        N_10[4] = N/10000;
        N_10[3] = (N%10000)/1000;
        N_10[2] = (N%1000)/100;
        N_10[1] = (N%100)/10;
        N_10[0] = N%10;

        for (int i = 0; i < 10; i++) {
            int n = 0;
            if (E[i] == true) {
                D_Extra[n] = i;
                n++;
            } 
        }

        if (N_10[4] == 0) {
            first : for (int j3 = 0; j3 < 10; j3++) {
                if (E[j3] == true && N_10[3] <= j3) {
                    for (int j2 = 0; j2 < 10; j2++) {
                        if (E[j2] == true && N_10[2] <= j2) {
                            for (int j1 = 0; j1 < 10; j1++) {
                                if (E[j1] == true && N_10[1] <= j1) {
                                    for (int j0 = 0; j0 < 10; j0++) {
                                        if (E[j0] == true && N_10[0] <= j0) {
                                            out.println(j3*1000 + j2*100 + j1*10 + j0);
                                            break first;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        } else {
            first : for (int j4 = 0; j4 < 10; j4++) {
                if (E[j4] == true && N_10[4] <= j4) {
                    for (int j3 = 0; j3 < 10; j3++) {
                        if (E[j3] == true && N_10[3] <= j3) {
                            for (int j2 = 0; j2 < 10; j2++) {
                                if (E[j2] == true && N_10[2] <= j2) {
                                    for (int j1 = 0; j1 < 10; j1++) {
                                        if (E[j1] == true && N_10[1] <= j1) {
                                            for (int j0 = 0; j0 < 10; j0++) {
                                                if (E[j0] == true && N_10[0] <= j0) {
                                                    out.println(j4*10000 + j3*1000 + j2*100 + j1*10 + j0);
                                                    break first;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }


        
        sc.close();
    }
}