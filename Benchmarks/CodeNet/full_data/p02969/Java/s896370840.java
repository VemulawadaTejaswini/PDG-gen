import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = stdIn.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n ;i++){
            a[i] = stdIn.nextInt();
        }

        int[] b = new int[n];
        
        for(int i = n-1; i >= n/2  ; i--) {
            b[i] = a[i];
        }

        for(int i = n/2 - 1; i >= 0; i--) {
            int countBall = 0;
            //int m = n / (i+1);
            for(int j = i; j < n;j += (i + 1)) {
                if((j+1) % (i+1) == 0 ){
                    if(b[j] == 1) {
                        countBall++;
                    }
                }
            }
            if(countBall % 2 == 0) {
                b[i] = a[i];
            }else if(a[i] == 0){
                b[i] = 1;
            }else {
                b[i] = 0;
            }
        }

        int count = 0;
        for(int i = 0;i < n ;i++) {
            if(b[i] == 1) {
                count++;
            }
        }
        System.out.println(count);
    
        for(int i = 0 ; i < n;i++) {
            if(b[i] == 1){
                System.out.println(i+1);
            }
        }

    }
}