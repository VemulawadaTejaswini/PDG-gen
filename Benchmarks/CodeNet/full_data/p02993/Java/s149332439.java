import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        char[] ch = new char[4];
        String result = "Good";

        for(int i = 0; i < ch.length; i++){
            ch[i] = str.charAt(i);
        }

        for(int i = 1; i < ch.length; i++){
            if(ch[i - 1] == ch[i])
                result = "Bad";
        }

        System.out.println(result);
    }
}