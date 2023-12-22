/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author kchpc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AtCoder atc = new AtCoder();
        
        System.out.println(atc.questionA());
    }
    
    public int questionA(){
        Scanner scan =new Scanner(System.in);
        String input = scan.nextLine();
        
        String[] point = input.split(" ");
        int kankaku = Integer.parseInt(point[0]);
        int maisu = Integer.parseInt(point[1]);
        int time = Integer.parseInt(point[2]);
        return (time / kankaku) * maisu;
    }
    
}
