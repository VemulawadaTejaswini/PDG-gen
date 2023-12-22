import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] a = new boolean[110];
        a[0] = true;
        for(int i = 1;i<100;i++){
            if(a[i%4] == true){
                a[i] =true;
            }else if(a[i%7] == true){
                a[i] = true;
            }else{
                a[i] = false;
            }
        }
        if(a[n] == true){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}