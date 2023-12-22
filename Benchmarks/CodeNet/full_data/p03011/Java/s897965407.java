import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        int sum=0;
        if(p>q&&p>r){
            sum=q+r;
        }else if(q>p&&q>r){
            sum-=p+r;
        }else{
            sum=p+q;
        }
        System.out.println(sum);
    }
}