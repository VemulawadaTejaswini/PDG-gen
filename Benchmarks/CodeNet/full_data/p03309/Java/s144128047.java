import java.util.Scanner;

class Main {
    public static int kanacy(int b, int[] a) {
        int sum=0;
        for(int i=0; i<a.length; i++) {
            sum += Math.abs(a[i] - b);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        //long max = 0;
        int offsetMax =0;
        int offsetMin = 1000000;
        int[] offset = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            //max = a[i]>max ? a[i] : max;
            offset[i] = a[i] - (i+1);
            offsetMax = offset[i]>offsetMax ? offset[i] : offsetMax;
            offsetMin = offset[i]<offsetMin ? offset[i] : offsetMin;
        }
        sc.close();
        int kmin = 1000000; 
        if(offsetMax==0) offsetMax=1;
        for(int b=offsetMin; b<offsetMax; b++) {
            int t = kanacy(b, offset);
            if(t<kmin) kmin = t;
        }
        System.out.println(kmin);
    }
}