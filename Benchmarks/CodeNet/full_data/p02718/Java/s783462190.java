import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
      
      	if(N == 1) {
          System.out.println("Yes");
        }
        
        else {
      	Integer a[] = new Integer[N];
      	for (int i=0; i<N; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a, Comparator.reverseOrder());
      
      	double sum = 0;
        for (int i=0; i<N; i++) {
          sum += a[i];
        }
      
      	double sum2 = sum * 1 / (4 * M);
          
        int i2 = 0;
      	while(a[i2] >= sum2) {
          i2++;
          if(i2 >= N) break;
        }
      	
      	if (i2 >= M)
            System.out.println("Yes");
        else
            System.out.println("No");
        }
    }
}