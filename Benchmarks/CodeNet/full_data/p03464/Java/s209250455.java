
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rn-sshawish
 */
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        boolean x = true;
        int [] d = new int[k];
        
        int secandMax = Integer.MIN_VALUE;
        
        for (int i = 0; i < k; i++) {
            d[i] = input.nextInt();
        }
        
        int max = d[0];
        if (k == 1) {
            System.out.println((max*2)+ " "+ ((max*2)+1));
            return;
        }
        for (int i = 1; i < k; i++) {
            if (x && d[i] > d[i - 1]) {
                max *=2;
                secandMax = d[i];
                x = false;
            }else  if (!x && d[i] > max) {
                max = -1;
                break;
            }
        }
        if (max == -1) {
            System.out.println(-1);
        }else{
            if (secandMax == Integer.MIN_VALUE) {
                secandMax = max +1;
            }else{
                secandMax =max +  2;
            }
            System.out.println(max + " " + (secandMax));
        }
    }
}
