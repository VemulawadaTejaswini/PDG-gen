import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        for(int i = 0; i < str.length(); i++){
            switch(str){
                case "A":
                    p("T") ;
                    break;
                case "T":
                    p("A");
                    break;
                case "G":
                    p("C");
                    break;
                case "C":
                    p("G");
                    break;
                default:
            }


        }
    }

    public static void p(String s){
        System.out.print(s);
    }
}