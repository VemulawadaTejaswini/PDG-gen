
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author wnqmw
 */
public class Main {
    public static void main(String args[]) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt(), m = kb.nextInt();
        System.out.println((n*(n-1))/2+(m*(m-1))/2);
    }
}
