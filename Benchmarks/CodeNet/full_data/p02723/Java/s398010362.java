
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
public class coffelike {
    public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        
        String s = kb.nextLine();
        if(s.charAt(2) == s.charAt(3) && s.charAt(4) == s.charAt(5)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
