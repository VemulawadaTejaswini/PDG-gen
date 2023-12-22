import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[3];
        int b[] = new int[3];
        for(int i = 0;i < 3;++i){
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
        }
        for(int i = 0;i < 3;++i){
            for(int j = i + 1;j < 3;++j){
                if(a[i] == a[j] || b[i] == b[j]) {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println("YES");
    }

}


