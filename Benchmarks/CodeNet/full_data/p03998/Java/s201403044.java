import java.util.*;
 
public class Main{
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        String Sa = sc.next();
        String Sb = sc.next();
        String Sc = sc.next();
        sc.close();

        int numA = Sa.length();
        int numB = Sb.length();
        int numC = Sc.length();
        int countA = 0;
        int countB = 0;
        int countC = 0;
        
        char turn = 'a';

        while(true){
            if(turn == 'a'){
                turn = Sa.charAt(countA);
                countA++;
            }
            if(turn == 'b'){
                turn = Sb.charAt(countB);
                countB++;
            }
            if(turn == 'c'){
                turn = Sc.charAt(countC);
                countC++;
                
            }
            if(countA == numA && turn == 'a'){
                System.out.println('A');
                break;
            }
            if(countB == numB && turn == 'b'){
                System.out.println('B');
                break;
            }
            if(countC == numC && turn == 'c'){
                System.out.println('C');
                break;
            }
        }
    }
}