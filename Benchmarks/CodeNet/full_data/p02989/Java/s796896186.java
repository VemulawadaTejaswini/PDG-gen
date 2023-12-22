import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);
        int N=sc.nextInt();
        int[] d=new int[N];
        int mid=0;
        int max=0;
        for(int i=0;i<N;i++){
            d[i]=sc.nextInt();
            mid+=d[i];
            if(d[i]>max){
                max=d[i];
            }
        }
        mid=1;
        int count=0;


        while(mid<max){
            int ABC=0;
            int ARC=0;
            for(int i=0;i<N;i++){
                if(d[i]>=mid){
                   ARC++;
                }else{
                    ABC++;
                }

            }

               if(ABC==ARC){
                   count++;
               }


                mid++;


        }

        System.out.println(count);






    }
}