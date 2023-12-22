import java.util.Scanner;
import java.util.Arrays;

class Main {

  public static void main(String args[]){

    Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
  
        int l = sc.nextInt();

        String tinge[] = new String[n];
 
    Scanner shit = new Scanner(System.in);
 

        for(int i = 0; i < n; i++){
 
        tinge[i] = shit.next();

        System.out.println(tinge[i]);

        }
          
    Arrays.sort(tinge);
   
        for(String t: tinge){
             System.out.print(t);
        }

        
  }

}