import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        
        char S1 = str.charAt(0);
        char S2 = str.charAt(1);
        char S3 = str.charAt(2);
        char S4 = str.charAt(3);

        String result = null;
        // if (S1 == S2) {
        //     if (S3 == S4) System.out.println("Yes");
        // } else if (S1 == S3) {
        //     if (S2 == S4) System.out.println("Yes");
        // } else if (S1 == S4) {
        //     if (S2 == S3) System.out.println("Yes");
        // } else {
        //     System.out.println("No");
        // }

        if (S1 == S2) {
            result = (S3 == S4) ? "Yes" : "No";
        } else if (S1 == S3) {
            result = (S2 == S4) ? "Yes" : "No";
        } else if (S1 == S4) {
            result = (S2 == S3) ? "Yes" : "No";
        } else {result = "No";}
        System.out.println(result);
    }
}