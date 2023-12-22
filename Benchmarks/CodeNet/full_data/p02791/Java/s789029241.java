import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] arr=new int[N];
        int count = 0;
        for(int j=0;j<N;j++) {
            arr[j]=sc.nextInt();
            
            if(j==0) {
                count++;
            } else if(arr[j-1]>arr[j]) {
                count++;
            }
        }
        System.out.println(count);
        
    }
}
