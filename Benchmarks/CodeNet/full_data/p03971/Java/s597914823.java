import java.util.*;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int A = sc.nextInt();
       int B = sc.nextInt();
       String S = sc.next();
       int rank = 0;
       boolean firstRank = true; 
       
       for(int i = 1 ; i<= N; i++ )
       {
           switch(S.charAt(i-1)){
           case 'a':
               if (rank < A+B ){
                   System.out.println("Yes");
                   rank++;
               }else{
                   System.out.println("No");
               }
                   break;
            case 'b':
                if(rank < A+B ){
                    if (rank < B || firstRank ) {
                        System.out.println("Yes");
                        firstRank = false;
                    }else {
                        rank--;
                        System.out.println("No");
                    }
                }
                else{
                    System.out.println("No");
                }
                break;
            case 'c':
                System.out.println("No");    
       }
       }
       
    }
}
