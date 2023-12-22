import java.util.*;
 
class Main {
    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);
        int nam[] = new int[3];

      for(int i = 0; i < 3 ;i++){
        nam[i] = sc.nextInt();
      }
       Arrays.sort(nam);
      
      System.out.print(nam[0]+nam[1]);
      
      

    }
}