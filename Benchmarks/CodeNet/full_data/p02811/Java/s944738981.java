import java.util.*;
public class Main {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);

       int K = sc.nextInt();
       int X = sc.nextInt();

       do{
             K+=K;
}while(K < X);
      if(K==X){
         System.out.println("Yes");
}
      else{
         System.out.println("No");
}
}
}
