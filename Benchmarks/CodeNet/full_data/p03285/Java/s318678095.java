import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n % 28;
        if(a==1||a==2||a==3||a==5||a==6||a==9||a==10||a==13||a==17||a==21){
            System.out.println("No");
        }
        else{
            System.out.println("Yes");
        }
    }
}
