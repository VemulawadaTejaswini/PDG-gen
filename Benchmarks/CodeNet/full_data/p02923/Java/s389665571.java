import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        
        int n = a.nextInt();
        int[] h = new int[n];
        for(int i = 0;i < n;i++){
            h[i] = a.nextInt();
        }

        int max = 0L;
        int count = 0L;

        for(int i = 0;i < n-1;i++) {
            if(h[i+1] <= h[i]){
                count++;
            }else{
                if(count > max) {
                    max = count;
                }
                count = 0;
            }
        }

        if(count > max){
            max = count;
        }
 
        System.out.println(max);
        
    }

}