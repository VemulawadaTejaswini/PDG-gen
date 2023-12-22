import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] mm = new long[n];
        long[] pp = new long[n];
        pp[0] = sc.nextInt();
        for(int i=1; i<n; i++){
            pp[i] = pp[i-1] + sc.nextLong();
        }
        long min = Long.MAX_VALUE;
        for(int i=1; i<n; i++){
            min = Math.min(min,Math.abs(pp[i]-pp[i-1]));
            // System.out.print(pp[i] + " ");
        }
        System.out.println(min);







        // for(int i=0; i<n; i++){
        //     mm[i] = sc.nextLong();
        // }
        // int i=0;
        // int j=n-1;
        // long sum1 = mm[i];
        // long sum2 = mm[j];
        // i++;
        // j--;
        // for(;i<=j;){
        //     // System.out.println(mm[i]);
        //     if(sum1 < sum2){
        //         sum1 += mm[i];
        //         i++;
        //     }else if(sum2 < sum1){
        //         sum2 += mm[j];
        //         j--;
        //     }else{
        //         sum1 += mm[i];
        //         sum2 += mm[j];
        //         i++;
        //         j--;
        //     }
        // }
        // System.out.println((long)Math.abs(sum1-sum2));
        sc.close();
    }
}