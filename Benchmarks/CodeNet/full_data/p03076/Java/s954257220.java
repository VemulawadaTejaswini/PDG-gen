import java.util.*;

class B{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n[] = new int[5];
        int min = 0;
        int swap = 0;

        for (int i = 0 ; i < 5 ; i++){
                n[i] = sc.nextInt();
            for (int j = 0 ; j < i ; j++) {
                if((n[i]%10) < (n[i]-1%10)){
                    swap = n[i-1];
                    n[i-1] = n[i];
                    n[i] = swap;
                }
            }
        }
    }
}