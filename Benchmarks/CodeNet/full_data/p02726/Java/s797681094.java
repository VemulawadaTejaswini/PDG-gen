import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int x= sc.nextInt();
        int y=sc.nextInt();
        //int maxLength = 1 + (x-1) + (n-x);
        int total = n*(n-1)/2 ;
        System.out.println(total);
        
    }
}