import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = (a*b*1)%2;
        int y = (a*b*2)%2;
        int z = (a*b*3)%2;
      
      if(x!=0||y!=0||z!=0){
         System.out.println("Yes");
      }else{System.out.println("No");}
    }
}