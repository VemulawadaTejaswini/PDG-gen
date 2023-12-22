import java.util.*;
import java.lang.*;
class Main{
    public static int p(int n){
        int count = 0;
        for(int i = 1; i < (int) Math.sqrt(n)+1; i++){
            if(n%i==0)count+=2;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int count = 0;
        for(int i = 105; i <= N; i+= 2){
            if(p(i) == 8)count++;
        }
        System.out.println(count);

    }
}
