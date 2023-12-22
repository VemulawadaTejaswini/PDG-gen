import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int total = 0;
        for(int i = 1; i <= N;i++){
            if(i % 15 == 0){
                total -= 200;total += 800;
            }else{
                total += 800;
            }
            System.out.println(i);
        }
        System.out.println(total);
    }
}
