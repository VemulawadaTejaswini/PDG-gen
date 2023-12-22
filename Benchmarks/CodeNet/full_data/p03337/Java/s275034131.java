import java.util.Scanner;

class rpA {
    public static void main(String args[]) {
        int A;
        int B;
        Scanner sc = new Scanner(System.in);

        System.err.println("-1000<=A,B<=1000となるA,Bを入力してください");

        A = sc.nextInt();
        B = sc.nextInt();

        int area1;
        int area2;
        int area3;

        area1 = A+B;
        area2 = A-B;
        area3 = A*B;

        int m = Math.max(area1, Math.max(area2, area3));

        System.out.println( m);

        return;
      }

    }