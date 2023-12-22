import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> a = new ArrayList<>();
        int b = 0;
        if(n==0){
            System.out.println(n);
        }
        else{
            while(n!=0){
                a.add(mod2(n));
                n = div2(n);
                b++;
           }
           for(int i=0; i<b; i++){
                System.out.print(a.get(b-1-i));
           }
        }
    }
    public static int div2(int n){
        if((n%2)!=0){
            n = n-1;
        }
        return n / (-2);
    }
    public static int mod2(int n){
        if((n%2)!=0){
            return 1;
        }
        else{
            return 0;
        }
    }
}