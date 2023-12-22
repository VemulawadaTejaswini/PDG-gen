import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toUpperCase();
        char a[] = s.toCharArray();
         int count = 0 ;
        for(int j = 0 ; j<a.length -1 ; j++)
        {
        
              if(a[j+1]==a[j]){
                 count++;
                   break ;
              }  
             
              }
        
          
        
        if(count>0)System.out.println("Bad");
        else System.out.println("Good");
    }
    
    
    
}
