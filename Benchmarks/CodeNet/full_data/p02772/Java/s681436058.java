import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ans ="";
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i= 0 ; i<n ; i++){
            a[i]= sc.nextInt();
            if (a[i] % 2 == 0) {
                if (a[i]!= 28 && a[i] % 5 == 0  || a[i] % 3 == 0) {
                     ans="true";
                }
                else if(a[i]!= 28 ){
                    ans = "false";
                    break;
                }
            }
            else {
                break;
            }
        }

        if (ans=="true"){
            System.out.println("APPROVED");
        }
        else {
            System.out.println("DENIED");
        }
    }
}
