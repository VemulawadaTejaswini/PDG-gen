import java.util.*;
class Main{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int sum = 0 ;
        int next = n ;
        for(int i = 0 ; next!=0 ; i++){
            int digit = next%10 ;
            sum+=digit ;
             next = next/10 ;
        }
        if(n%sum== 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
     }
}