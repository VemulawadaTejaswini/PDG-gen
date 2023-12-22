import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        if(n<(n-s.replaceAll("R", "").length())*2){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}