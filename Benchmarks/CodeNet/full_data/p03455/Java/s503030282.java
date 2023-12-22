
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
public class AtCOder86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println((input.nextInt() * input.nextInt())% 2 ==0 ?"Even": "Odd");
        
    }
}
