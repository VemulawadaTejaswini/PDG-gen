import java.util.*;
 
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int nam = 0;
        int cont = 0;
      
      for(int i=0;i<N;i++){
        nam += sc.nextInt();
        if(nam<=X){cont++;}
      }

      System.out.print(cont+1);

      
      
      
      
      


      
    }
}