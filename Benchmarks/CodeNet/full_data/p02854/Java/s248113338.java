import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] mm = new long[n];
        for(int i=0; i<n; i++){
            mm[i] = sc.nextLong();
        }
        int i=0;
        int j=n-1;
        long sum1 = mm[i];
        long sum2 = mm[j];
        i++;
        j--;
        for(;i<=j;){
            if(sum1 < sum2){
                sum1 += mm[i];
                i++;
            }else if(sum2 < sum1){
                sum2 += mm[j];
                j--;
            }else{
                sum1 += mm[i];
                sum2 += mm[j];
                i++;
                j--;
            }
        }
        System.out.println((long)Math.abs(sum1-sum2));
        sc.close();
    }
}