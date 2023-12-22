import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int ans = 0;
        for(int i = 0; i < n; i++){
            a[i] = scanner.nextInt();
            ans ^= a[i];
        }
        if(ans == 0){System.out.println("Yes");}
        else{System.out.println("No");}
    }
}

