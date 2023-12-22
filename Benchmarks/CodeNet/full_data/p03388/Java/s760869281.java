import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        long[] a = new long[q+2];
        long[] b = new long[q+2];
        a[0] = 0;
        b[0] = 0;
        a[q+1] = 0;
        b[q+1] = 0;
        for(int i=1;i<=q;i++){
            a[i] = sc.nextLong();
            b[i] = sc.nextLong();
        }
        int count = 0;
        long keep = a[1]*b[1];
        long rank;
        for(int k=1;k<=q;k++){
            for(long i=1;i<a[k]*b[k];i++){
                if(i!=a[k]){
                    rank = (a[k]*b[k]-1)/i;
                    if(rank<keep&&rank!=b[k]){
                        if(rank>0){
                            keep = (a[k]*b[k]-1)/i;
                            count++;
                        }
                        else{
                            break;
                        } 
                    }
                    else{
                        if(rank!=b[k]){
                            rank = keep-1;
                        }
                        else{
                            rank = b[k]-1;
                        }
                        if(rank>0){
                            count++; 
                            keep = rank;
                        }
                        else{
                            break;
                        }
                    }
                }
            }
            System.out.println(count);
            count = 0;
            keep = a[k+1]*b[k+1];
        }
    }
}