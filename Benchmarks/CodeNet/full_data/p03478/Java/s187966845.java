import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        int yono = 0;
        for(int i = 1 ; i <= n ; i++){
            if(i / 10000 + ((i / 1000) % 10) + ((i / 100) % 10) + ((i / 10) % 10) + i % 10 >= a && i / 10000 + ((i / 1000) % 10) + ((i / 100) % 10) + ((i / 10) % 10) + i % 10 <= b) yono += i;
        }
        System.out.println(yono);
    }
}