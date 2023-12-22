import java.util.*;
class Main{

     public static void main(String []args){
      Scanner scan = new Scanner(System.in);
      int m = scan.nextInt() ;
      int n = scan.nextInt() ;
       String s = scan.next();
      char arr[] = s.toCharArray();
      //for(int i = 0 ; i < m+n+1 ; i++){
       //   arr[i] = scan.next().charAt(0);
      //}
      int count = 0 ; 
      if(arr[m] == '-'){
          for(int i = 0 ; i<m+n+1 ; i++){
              if(i == m){
                  continue ;
              }
              if(arr[i]>='0' && arr[i]<='9'){
                  count++;
              }
          }
        	//System.out.println(count);
           if(count == m+n){
                System.out.println("Yes");
             }else{
            System.out.println("No");
             }
      
      }else{
          System.out.println("No");
      }   
    }
}