import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner scan = new java.util.Scanner(System.in);
        String s = scan.next();
        switch(s){
            case "SAT":
                System.out.println("1");
            case "FRI":
                System.out.println("2");
            case "THU":
                System.out.println("3");
            case "WED":
                System.out.println("4");
            case "TUE":
                System.out.println("5");
            case "MON":
                System.out.println("6");
            case "SUN":
                System.out.println("7");
        }
    }
}