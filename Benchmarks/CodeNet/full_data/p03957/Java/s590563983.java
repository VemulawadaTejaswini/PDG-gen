
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        boolean flag = false;
        if(s.lastIndexOf("C")>=0&&s.lastIndexOf("C")<s.indexOf("F")){
            flag = true;
        }
        if(flag){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }

 }
