import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int a = sc.nextInt();
        int s = h / a;
        if(h % a != 0){
            s++;
        }
        System.out.println(s);
        sc.close();
    }
}