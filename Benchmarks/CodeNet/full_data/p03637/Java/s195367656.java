import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        int re1 = 0,re2=0,re4=0;
        int ans = 0;
        for (int i = 0; N > i; i++) {
            a[i] = sc.nextInt();
            if (a[i] % 4== 0) {
                re4++;
            }
            else if (a[i] == 2) {
                re2++;
            }
        }
        re1=N-(re4+re2);
        if ((re2==0&&re1<=re4+1)||(re2>0&&re1<=re4)) {
            System.out.println("Yes");
        } 
        else{
            System.out.println("No");
        }

    }
}