import java.util.Scanner;

public class Main{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        
        int progression[] = new int[n];
        
        int minPosition = 0;
        for(int i = 0; i < n; i++){
            progression[i] = sc.nextInt();
            if(progression[i] == 0){
                minPosition = i;
            }
        }

        int leftS = minPosition % (k - 1);
        int rightS = (n - minPosition - 1) % (k - 1);

        int left = 0;
        if(minPosition != 0){
            if(minPosition == k - 1){
                left = 1;
            }else{
                left = minPosition / (k - 1) + 1;
                left = leftS > 0 ? left + 1 : left;
            }
        }
        
        int right = 0;
        if(minPosition != n - 1){
            if(minPosition == n - k){
                right = 1;
            }else{
                right = (n - minPosition - 1) / (k - 1);
                right = rightS > 0 ? right + 1 : right;
            }
        }
        
        int count = right + left;
        if(rightS == 1 && leftS == 1){
            count--;
        }
        
        System.out.println(count);
        
    }
}

