import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        boolean f = true;
        if(N == 1) f = false;

        for(int i=0; i<N/2;i++){
            if(S.charAt(i) != S.charAt(i+N/2)){
                f = false;
            }
        }
        
        if(f == true){
        System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}