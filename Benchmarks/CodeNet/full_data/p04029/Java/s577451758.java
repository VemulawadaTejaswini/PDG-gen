import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fig = Integer.parseInt(sc.next());
        int ame = (1 + fig) * fig / 2;
        System.out.println((int)ame);
    }
}