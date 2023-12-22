import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        boolean honest = false;
        if(a.equals("H")){
            if(a.equals("H")){
                honest = true;
            }
            if(a.equals("D")){
                honest = false;
            }
        }
        if(a.equals("D")){
            if(a.equals("H")){
                honest = false;
            }
            if(a.equals("D")){
                honest = true;
            }
        }
        if(honest){
            System.out.println("H");
            return;
        }
            System.out.println("D");
    }
}
