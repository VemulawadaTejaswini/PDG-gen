import java.util.Scanner;

 class SOlution {
//    static int N;
//    static int arr[] = new int[N];
//    static int totalCost;
    public static void main(String[] args) {
        Scanner ad = new Scanner(System.in);
        int N = ad.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = ad.nextInt();
        }
        int myarr[] = new int[N + 1];
        int totalCost = 0;
        if( N > 2 ){

            myarr[0] = Math.abs(arr[0] - arr[1]);
            myarr[1] = Math.abs(arr[1] - arr[2]);

            for (int i = 2; i < N; i++) {
                myarr[i] = Math.min(Math.abs(myarr[i-1] - arr[i-1]),Math.abs(myarr[i-1] - arr[i-2]));
                totalCost = totalCost + myarr[i];
                //System.out.println(totalCost);
            }
            System.out.println(totalCost);
            //int totalCost = 0;
            //int s = 0;
        }
        else
            System.out.println(Math.abs(arr[0] - arr[1]));
    }

    static int optimizeHeight(int h0,int h1,int h2, int start){

        //totalCost = totalCost + Math.min(Math.abs(optimizeHeight(arr[start] - arr[start+1])))


         return 0;
    }
}
