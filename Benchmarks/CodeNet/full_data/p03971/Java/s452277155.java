import java.util.*;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int A = sc.nextInt();
       int B = sc.nextInt();
       String S = sc.next();
       int kq = 0;
       boolean Bo = true; 
       
       for(int i = 0 ; i< N; i++ )
       {
           switch(S.charAt(i)){
           case 'a':
               if (kq < A+B ){
                   System.out.println("Yes");
                   kq++;
               }else{
                   System.out.println("No");
               }
                   break;
            case 'b':
                if(kq < A+B ){
                    kq++;
                    if (kq <= B || Bo ) {
                        System.out.println("Yes");
                        
                        Bo = false;
                    }else {
                        kq--;
                        System.out.println("No");
                    }
                }
                else{
                    System.out.println("No");
                }
                break;
            default:
                System.out.println("No");    
       }
       }
       
    }
}
