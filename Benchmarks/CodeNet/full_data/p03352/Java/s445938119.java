import java.util.*;
 public class Main{

     public static void main(String []args){
        Scanner scan = new Scanner(System.in);
       
        int n =scan.nextInt();
        int max  = 0  , count = 0;
        for(int i = 1 ; i <= n ; i++){
            for(int j = 2 ; j <= n ; j++){
                if((int)Math.pow(i,j)>n){
                    break ;
                }else{
                    if(Math.pow(i,j) - (int)Math.pow(i,j)==0){
                        max = (int)Math.pow(i,j);
                        count++;
                      	break;
                    }
                  //System.out.println((int)Math.pow(i,j));
                }
            }
            if(count==0){
                break ;
            }
        } 
        System.out.println(max);
        
      
     }
}