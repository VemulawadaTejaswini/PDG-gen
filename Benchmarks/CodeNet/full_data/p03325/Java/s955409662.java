import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] numbers = new int[n];
        for(int i = 0;i<n;i++){
            numbers[i] = sc.nextInt();
        }
        int flag = 0;
        int answer = 0;
        while(flag < 2){
            for(int i = 0;i<n;i++){
                if(numbers[i] % 2 == 1 || numbers[i] == 0){
                    numbers[i] = 1;
                    flag++;
                }
            }
            if(flag < n){
                answer++;
                flag = 0;
            }
            for(int i = 0;i<n;i++){
                if(numbers[i] % 2 == 0){
                    numbers[i] /= 2;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}