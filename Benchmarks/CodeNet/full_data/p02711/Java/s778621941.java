import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        for(int i = 0; i < a.length(); i++){
            if(a.substring(i,i) == "7"){
                System.out.println("Yes");
                return;
            }
        }
        System.out.println(No);
    }
}