import java.util.*;

class ABC091A{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C = 0;
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
        if(A + B >= C){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
}