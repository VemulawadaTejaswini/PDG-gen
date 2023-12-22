import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 
        System.out.println("キーボードから入力してください");
 
        Scanner scan = new Scanner(System.in);
 
        String str = scan.next();
        String[] strArray = str.split("");
        if(strArray[0].equals(strArray[1])||strArray[1].equals(strArray[2])||strArray[0].equals(strArray[1])&&strArray[1].equals(strArray[2])){
  
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
 
}
