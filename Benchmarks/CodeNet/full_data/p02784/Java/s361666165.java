import java.util.*;
class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int n = sc.nextInt();
        int a = 0;
        int t = 0;
        for(int i=0;i<n;i++){
            a = sc.nextInt();
            t = t + a;
        }
        if(h<=t){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}