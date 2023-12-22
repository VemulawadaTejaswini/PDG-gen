import java.util.Scanner;  

  public class Main {
          public static void main(String[] args){
        
        Scanner input = new Scanner(System.in);
        int masuk=input.nextInt();
        int total=0;
        for (int a=1;a<=masuk;a++){
            total+=a;
        }
        System.out.println(total);
}
}