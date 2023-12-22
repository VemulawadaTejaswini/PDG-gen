import java.util.Scanner;

public class  Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //3つのキャンディーパックを２人に分ける
        String a = sc.next(); //キャンディーa
        String b = sc.next(); //キャンディーb
        String c = sc.next(); //キャンディーc
        
        System.out.println("A" + b.substring(0, 1) + "B");
}
}