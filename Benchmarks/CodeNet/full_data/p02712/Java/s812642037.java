import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.close();
        int M = 0;
    	for(int i=0;i <=N ;i++){
            if(i%3 != 0 && i%5 != 0){
                M = M + i;
            }
        }
        System.out.print(M);
    }
}