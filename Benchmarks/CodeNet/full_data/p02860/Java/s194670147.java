import java.util.Scanner;

public class Main{
    public static Scanner scan  = new Scanner(System.in);
    public static void main(String[]args){
        int n;
        String s;
        boolean flag;

        flag = false;
        n=nextInt();
        s=next();
        if(n%2==1){
            print("No");
            System.exit(0);
        }
        else{
            for(int i=0;i<n/2;i++){
                if(s.charAt(i)==s.charAt(i+n/2)){
                    flag=true;
                }
                else{
                    print("No");
                    System.exit(0);
                }
            }
            if(flag) print("Yes");
        }
    }



    public static int nextInt(){
        return Integer.parseInt(scan.next());
    }
    public static long nextLong(){
        return Long.parseLong(scan.next());
    }
    public static String next(){
        return scan.next();
    }
    public static double nextDouble(){
        return Double.parseDouble(scan.next());
    }
    public static float nextFloat(){
        return Float.parseFloat(scan.next());
    }

    //Yes or No
    public static void yesNo(boolean flag){
        if(flag) System.out.println("Yes");
        else System.out.println("No");
    }
    public static void print(Object a){
        System.out.println(a);
    }
}