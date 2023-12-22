import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int l = sc.nextInt();
        int min = l;
        int max=n+l-1;
        int eat;
        int sum=0;
        if(min<0||max<0) {
            eat = max;
        }else if(min>0||max>0){
            eat = min;
        }else{
            eat = 0;
        }
        for(int i = 0;i<n;i++){
            sum = sum+ l+i;
        }
        sum=sum-eat;
        System.out.println(sum);
    }
}

