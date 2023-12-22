
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author c0117321c5
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double probability = 0.0;
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (double i = 1; i <= a; i++) {
            if (i % 2 == 1) {
                probability += 1.0;
            }
        }
        System.out.println(probability / a);

    }

}
