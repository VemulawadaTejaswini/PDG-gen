import java.util.*;
public class Main {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int N = sc.nextInt();
       int A = sc.nextInt();
       int B = sc.nextInt();
       String S = sc.next();
       int kq = 0;
       int Bo = 0; 
       
       for(int i= 0 ; i< N; i++ )
       {
           switch(S.charAt(i)){
           case 'a':
               if (kq <= A+B ){
                   System.out.println("Yes");
                   kq++;
               }
                   break;
            case 'b':
                if(kq <= A+B && (kq <= B|| Bo == 0 )){
                    System.out.println("Yes");
                   kq++;
                   Bo++;
                }
                break;
            default:
                System.out.println("No");    
       }
       }
       
    }
}
