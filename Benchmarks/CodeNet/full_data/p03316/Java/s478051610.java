import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        long j = 1;
        for(int i=0; i<10; i++){
            sum += n%(10*j);
            j *= 10;
        }
        if(n%sum==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
