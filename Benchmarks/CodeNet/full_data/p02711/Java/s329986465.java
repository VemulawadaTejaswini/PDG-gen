import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int re = n.indexOf("7");
        if(re != -1) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    } 
}