import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = Integer.parseInt(sc.next());
        boolean ok = true;
        for(int i = 0; i < n; i++){
            int a = Integer.parseInt(sc.next());
            if(a % 2 == 0){
                if(a % 3 != 0 && a % 5 != 0){
                    ok = false;
                }
            }
        }
        
        if(ok){
            System.out.println("APPROVED");
        }else{
            System.out.println("DENIED");
        }
    }
}