import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //sc.nextLine();
        //sc.close();
        String[] n  = str.split(" ");
        int r = Integer.parseInt(n[0]);
        int d = Integer.parseInt(n[1]);
        int x2000 = Integer.parseInt(n[2]);
        
        int ans = 0;
        for ( int i = 0; i < 10; i++ ){
            ans = r * x2000 - d;
            System.out.println(ans);
            x2000 = ans;
        }
    } 
} 