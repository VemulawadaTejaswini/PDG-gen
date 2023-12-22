import java.util.*;

public class Main {

    public static void main(String[] args) {

        String num;
        char ch;
        boolean b = false;

        Scanner sc = new Scanner(System.in);
        num = sc.nextLine();
        ch = num.charAt(0);

        for(int i=1;i<4;i++){
            if(ch==num.charAt(i)){
                b = true;
                break;
            }
            ch = num.charAt(i);
        }

        if(b){
            System.out.println("Bad");
        }else{
            System.out.println("Good");
        }


    }
}