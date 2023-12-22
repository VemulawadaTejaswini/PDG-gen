
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] input = new int[n][2];
        for(int i=0;i<n;i++){
            input[i][0]=sc.nextInt();
            input[i][1]=sc.nextInt();
        }
        sc.close();

        int ret=0;
        int a=1,b=1;
        for(int i=0;i<n;i++){
            if(i==0) {
                a = input[i][0];
                b = input[i][1];
            }
            else{
                double left = a/b;
                double right = ((double)(input[i][0]))/(double)input[i][1];
               // System.out.println("left"+left+" right"+right);
                if(left<right){
                    //need to increase left less
                    if(b%input[i][1]==0){
                        a = b/input[i][1]*input[i][0];
                    }
                    else{
                        b = findNext(b,input[i][1]);
                        a = b/input[i][1]*input[i][0];
                    }

                }
                else if (left>right){
                    //need to increase right less
                    if(a%input[i][0]==0){
                        b = a/input[i][0]*input[i][1];
                    }
                    else{
                        a = findNext(a,input[i][0]);
                        b = a/input[i][0]*input[i][1];
                    }
                }
                else {
                    //no need to update a , b
                }
            }
           // System.out.println("a:"+a+",b="+b);

        }
      //  String s = ""+ (a + b);
       ;
        System.out.println( a+b);
    }

   static int findNext(int base, int x){

        int d = base;
        while(true){
            if(d%x==0)
                return d;
            d++;
        }

    }

 }
