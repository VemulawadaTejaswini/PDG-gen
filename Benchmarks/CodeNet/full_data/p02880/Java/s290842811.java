import java.util.*;
public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        //String s = sc.next();
        //Long x = sc.nextLong();

        if(n>81){
            System.out.println("No");
            return;
        }
        for(int i=2;i<10;i++){
            for(int j=1;j<10;j++){
                if(i*j == n){
                    System.out.println("Yes");
                }
            }
        }

        System.out.println("No");
    }
}
