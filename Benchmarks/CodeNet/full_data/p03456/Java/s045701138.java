
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
        int a = input.nextInt();
        int b = input.nextInt();
        int c = Integer.parseInt(a+""+b);
        double x = Math.sqrt(c);
        double y = (int)x;
        if (x > y) {
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }
        
    }
}
