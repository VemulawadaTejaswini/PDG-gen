import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc =new Scanner(System.in);
        int N =sc.nextInt();
        String s[]  = new String[N];
        int m=0;
        int a=0;
        int r=0;
        int c=0;
        int h=0;
        for (int i=0;i<N;i++) {
            s[i] = sc.nextLine();
            if(s[i].startsWith("M")) {
                m++;
            }
            if(s[i].startsWith("A")) {
                a++;
            }
            if(s[i].startsWith("R")) {
                r++;
            }
            if(s[i].startsWith("C")) {
                c++;
            }
            if(s[i].startsWith("H")) {
                h++;
            }
        }
        long ans =m*a*r + m*a*c + m*a*h + m*r*c + m*r*h + m*c*h
                +a*r*c + a*r*h + a*c*h + r*c*h;
        System.out.println(ans);

    }
}
