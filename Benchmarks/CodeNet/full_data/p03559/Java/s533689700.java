import java.util.Arrays;

class Main {
    public static void main(String args[]) {
		java.util.Scanner sc = new java.util.Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int[] A = new int[n];
        int[] B = new int[n];
        int[] C = new int[n];
        for(int i=0; i<n; i++) A[i] = Integer.parseInt(sc.next());
        for(int i=0; i<n; i++) B[i] = Integer.parseInt(sc.next());
        for(int i=0; i<n; i++) C[i] = Integer.parseInt(sc.next());
        Arrays.sort(A);
        Arrays.sort(C);
        int sum=0;
        for(int b : B){
            int na =  Arrays.binarySearch(A, b);
            int nc = C.length - Arrays.binarySearch(C, b);
            if(na <= 0 || nc <= 0) continue;
            sum += na*nc;
        }
        System.out.println(sum);
        sc.close();
    }
}