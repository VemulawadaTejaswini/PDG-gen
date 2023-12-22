import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int x = scanner.nextInt();
        for(int i = x-k+1; i <= x+k-1; i++){
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}

