import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String c = sc.next();
        if(c.charAt(3) == c.charAt(4) && c.charAt(5) == c.charAt(6)){
            System.out.println("Yes");
        } else {System.out.println("No");}
        sc.close();
    }
}