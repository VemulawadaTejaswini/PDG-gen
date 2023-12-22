import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        int r = 0;
        int b = 0;
        
        for(int i=0; i<N; i++){
            if(str.charAt(i)=='R'){
                r++;
            }else{
                b++;
            }
        }
        if(r>b){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
