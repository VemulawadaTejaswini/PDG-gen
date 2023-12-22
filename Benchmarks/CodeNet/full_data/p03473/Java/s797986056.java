import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();

        if(M >= 24){
            System.out.println(24-M);
        }else{
            System.out.println(24-M + 24);
        }
    }
}