import java.util.*;

class Main{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] a = new int[N];
        int x = 0;
        int y = 0;

        for(int i=0; i<N; i++){
            a[i] = sc.nextInt();
            if(a[i]%4==0){
                x++;
            }
            else if(a[i]%2==0){
                y++;
            }
        }
        if(y>=2){
            N -= y - 1;
        }
        if(x>=N/2){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}