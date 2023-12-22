import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int q = sc.nextInt();
        int a[] = new int[n-1];
        int b[] = new int[n-1];
        int p[] = new int[q];
        int x[] = new int[q];
        int count[] = new int[n];
        for(int i = 0; i < n; i++){
            if(i != n-1){
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }
            count[i] = 0;
        }

        for(int i = 0; i < q; i++){
            p[i] = sc.nextInt();
            x[i] = sc.nextInt();

            count[p[i]-1] += x[i];
            for(int j = 0; j < n-1; j++){
                if(p[i] == a[j]){
                    count[b[j]-1] += x[i];
                    for(int k = 0; k < n-1;k++){
                        if(b[j] == a[k]){
                            count[b[k]-1] += x[i];
                        }
                    }
                }
            }
        }
        for(int i = 0; i < n-1; i++){
            System.out.print(count[i]+" ");
        }
        System.out.println(count[n-1]);
    }
}