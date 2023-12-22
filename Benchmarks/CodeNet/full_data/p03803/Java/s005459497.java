import java.util.*;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        String ans = "";
        if(a-b>0 || a==1)
            ans = "Alice";
        if(a-b<0 || b==1)
            ans = "Bob";
        if(a==b)
            ans = "Draw";
        

        System.out.println(ans);
        
    }
}