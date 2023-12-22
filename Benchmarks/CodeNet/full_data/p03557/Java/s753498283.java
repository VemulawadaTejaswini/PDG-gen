import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];

        for(int i = 0; i<n; i++) a[i] = sc.nextInt();
        for(int i = 0; i<n; i++) b[i] = sc.nextInt();
        for(int i = 0; i<n; i++) c[i] = sc.nextInt();

        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);

//        for(int ca:a) System.out.print(ca + " ");
//        System.out.println();
//        for(int cb:b) System.out.print(cb+ " ");
//        System.out.println();
//        for(int cc:c) System.out.print(cc+ " ");
//        System.out.println();

        long ans = 0;
        for(int i = 0; i<n; i++) {
            int x = countCandy(a, b[i], 1);
            int y = countCandy(c, b[i], -1);
            //System.out.println(x +" "+ y);
            ans += x*y;
        }
        System.out.println(ans);

    }
    public static int countCandy(int[] sortedA, int num, int a) {
        int head = 0;
        int end = sortedA.length-1;
        int middle = (head+end)/2;

        while(head<=end) {
            if(sortedA[middle]==num) {
                if(a==1) return middle;
                else return sortedA.length - middle-1;
            }
            else if(sortedA[middle]<num) {
                head = middle+1;
                middle = (head+end)/2;
            }else {
                end = middle-1;
                middle = (head+end)/2;
            }
        }
        if(a==1) return end+1;
        else return sortedA.length - head;

    }
}