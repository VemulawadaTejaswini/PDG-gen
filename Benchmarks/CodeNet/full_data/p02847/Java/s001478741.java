import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner stdin = new Scanner(System.in);

        String S = stdin.next();

        if(S == "SUN"){
            System.out.print("7");
        }
        else if(S == "MON"){
            System.out.print("6");
        }
        else if(S == "TUE"){
            System.out.print("5");
        }
        else if(S == "WED"){
            System.out.print("4");
        }
        else if(S == "THU"){
            System.out.print("3");
        }
        else if(S == "FRI"){
            System.out.print("2");
        }
        else if(S == "SAT"){
            System.out.print("1");
        }
    }
}