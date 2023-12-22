import java.util.Scanner;

class Main{
    public static void main(String args[]){
        int count = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] a =new String[n];
        int[] b = new int[n];
        Scanner sc = new Scanner(System.in);
        for(int i = 0;i <n;i++){
            a[i] = sc.next();
        }
        for(int j = 0; j<n;j++){
            b[j] = Integer.parseInt(a[j]);
        }
        for(int i = 0;i < n-2;i++){
            if(b[i]<b[i + 1]&& b[i + 1]<b[i + 2]){
                count++;
            }else if(b[i]>b[i + 1]&&b[i + 1]>b[i + 2]){
                count++;
            }
        }
        System.out.print(count);
    }
}