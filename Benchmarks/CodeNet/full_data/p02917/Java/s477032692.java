import java.util.Scanner;
 
class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int b[] = new int[n-1];
        int sum = 0;
        for(int i = 0 ; i < n-1;i++){
            b[i] = sc.nextInt();
        }
        sum += b[0] + b[n-2];
        for(int i = 1; i < n-1; i++){
            if(b[i] < b[i-1]){
                sum += b[i];
            }else{
                sum += b[i-1];
            }
        }
        System.out.println(sum);
    }
}