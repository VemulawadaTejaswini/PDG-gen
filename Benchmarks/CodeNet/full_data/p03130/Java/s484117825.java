import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] count = new int [4];
        
        for(int i=0; i<6; i++){
            int tmp = sc.nextInt();
            count[tmp-1]++;
        }
        
        boolean judge = true;
        for(int i=0; i<4; i++){
            if(count[i]>2){
                judge = false;
                break;
            }
        }
        
        if(judge) System.out.println("YES");
        else System.out.println("NO");
    }
}
