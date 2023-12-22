/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




import java.util.* ;

/**
 *
 * @author nai
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();
        int man, gosen, sen;
        boolean isAns = false;
        
        LOOP1 : for(int mi = 0 ; mi <= N ; mi++){
            for(int gi = 0 ; gi <= N - mi ; gi++){
                int si =   ( Y - mi * 10000 - gi * 5000 ) / 1000; 
                if(si == N - mi - gi){
                    isAns =true;
                    System.out.print(mi+" "+gi+" "+si);
                    break LOOP1;
                }
            }
        }
        if(!isAns){
            System.out.println("-1 -1 -1");
        }
    }
}
  
    

