  import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b  = sc.nextInt();
            int res  =  1;
            int total = a;
            for(int i  = 0 ;i<a && total < b;i++)
            {
                total+=(a-1);
                res+=1;
            }
            System.out.println(res);
        }
    }
