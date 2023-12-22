import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 2;
        int c = 1;
      
		while(true){
          if(c%b==0 && c%a==0){
            break;
          }
          c++;
        }
      System.out.println(c);
    }
}