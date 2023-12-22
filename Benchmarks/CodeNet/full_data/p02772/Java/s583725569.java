import java.util.*;
public class Main {

    public static void main(String[] args) {
        Scanner  yomi = new Scanner(System.in);
        int a = yomi.nextInt();
        boolean tf=true;
        int[] n = new int[a];
        for (int i=0;i<a;i++){
            n[i] = yomi.nextInt();
    }
        for (int i=0;i<a;i++){
            if (n[i]%2==0){
                if (n[i]%3==0||n[i]%5==0){

                }else tf=false;
            }
        }
        if (tf){
            System.out.println("APPROVED");
        }else System.out.println("DENIED");
    }
}