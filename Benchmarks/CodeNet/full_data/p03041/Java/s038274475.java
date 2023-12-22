import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        String S = sc.next();
        String[] SH = S.split("");
        
        if(SH[K].equals("A")){
            SH[K] = "a";
        }else if(SH[K].equals("B")){
            SH[K] = "b";
        }else{
            SH[K] = "c";
        }
        
        for(String sh : SH){
            System.out.print(sh);
        }
    
    }
}