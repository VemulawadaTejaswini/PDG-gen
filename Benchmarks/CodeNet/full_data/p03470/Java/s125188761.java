import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int[] d=new int[N];
        for(int i=0;i<N;i++){
            d[i]=sc.nextInt();
        }
        d=sort(d);
        int temp=d[0];
        int sum=1;
        for(int i=1;i<N;i++){
            if(temp>d[i]){
                sum++;
                temp=d[i];
            }
        }
        System.out.println(sum);
    }

    static int[] sort(int[] num){
        int temp=0;
        for(int i=0;i<num.length-1;i++){
            for(int j=num.length-1;j>i;j--){
                if(num[j] > num[j-1]){
                    temp=num[j];
                    num[j]=num[j-1];
                    num[j-1]=temp;
                }
            }
        }
        return num;
    }
}