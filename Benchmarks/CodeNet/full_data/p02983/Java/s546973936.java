import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int l = scanner.nextInt() % 2019;
        int r = scanner.nextInt() % 2019;
        int min = Integer.MAX_VALUE;
        for(int i = r; i <= l-1; i++){
            for(int j = i+1; j <= l; j++){
                min = Math.min(min, i*j%2019);
            }
        }
        System.out.println(l*(l+1)%2019);
    }
}

