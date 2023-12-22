import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            boolean check =false;

            if(n%7==0) check=true;

            n=n/10;
            if(n%7==0)check=true;
            n=n/10;
            if(n%7==0)check=true;

            System.out.println(check?"Yes":"No");
          }
        }
