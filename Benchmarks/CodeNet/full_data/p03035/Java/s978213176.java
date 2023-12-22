import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nennrei = sc.nextInt();
        int b = sc.nextInt();

        if(nennrei > 12){
          System.out.println(b);
        }else if(nennrei < 6){
          System.out.println(0);
        }else{
          System.out.println(b/2);
        }
    }
}
