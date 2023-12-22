import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str == "SUN"){
            System.out.println(7);
        }else if(str == "MON"){
            System.out.println(6);
        }else if(str == "TUE"){
            System.out.println(5);
        }else if(str == "WED"){
            System.out.println(4);
        }else if(str == "THU"){
            System.out.println(3);
        }else if(str == "FRI"){
            System.out.println(2);
        }else if(str == "SAT"){
            System.out.println(1);
        }
    }
}