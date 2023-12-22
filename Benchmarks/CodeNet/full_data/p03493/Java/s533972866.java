import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int[] s = new int[3];
        s[0] = scan.nextInt();
        s[1] = scan.nextInt();
        s[2] = scan.nextInt();
        int count = 0;
      
      for(int i : s){
        if(i == 1){
        count ++;
        }
      }
      
      System.out.println(count);
      
       
      
    }
}