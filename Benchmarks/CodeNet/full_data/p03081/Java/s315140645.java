/*
* @Author Silviase(@silviasetitech)
* For ProCon
*/

import java.util.*;
import java.lang.*;
import java.math.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // mazu input
        int n = sc.nextInt();
        int q = sc.nextInt();
        String s = sc.next();
        String[] choice = new String[q];
        String[] lORr = new String[q];
        for (int i = 0; i < q; i++) {
            choice[i] = sc.next();
            lORr[i] = sc.next();
        }
        int pivotl = -1;
        int pivotr = n;

        for (int i = q-1; i >= 0; i--) {
            if (lORr[i].equals("L")) {
                if (s.charAt(pivotl + 1) == choice[i].charAt(0)  ){
                    pivotl++;
                }
            }else{ // R
                if (s.charAt(pivotr - 1) == choice[i].charAt(0) ) {
                    pivotr--;
                }
            }
            if (pivotr-pivotl <= 1) {
                break;
            }
        }

        System.out.println(pivotr-pivotl-1);


        sc.close();
    }

}



