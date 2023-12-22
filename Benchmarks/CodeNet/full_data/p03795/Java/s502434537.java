/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atcoderjava;

import java.util.Scanner;

/**
 *
 * @author takaesumizuki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        Integer eat = new Integer(str);
        Integer refundMoney = eat/15*200;
        Integer payMoney = eat * 800;
        Integer diffMoney = payMoney - refundMoney;
        System.out.println(diffMoney);
        
    }
    
}
