import java.io.*;
import java.util.*;

public class Main{
    
    public static void main(String[] arg){

        Scanner scan =new Scanner(System.in);

        int n=Integer.parseInt(scan.next());
        int m=Integer.parseInt(scan.next());

        long[] A=new long[n];

        for(int i=0;i<n;i++){
            A[i]=scan.nextLong();
         
        }

        int i,j,k;
        
        BandC[] BC=new BandC[m];
        SortBandC srt=new SortBandC();

        for(i=0;i<m;i++){

            BC[i]=new BandC(Integer.parseInt(scan.next()), 
                Integer.parseInt(scan.next()));
        }

        Arrays.sort(BC, srt);

        int[] D=new int[n];
        int count=0;
        for(k=0;k<m;k++){
            for(i=0;i<BC[k].b;i++){
                if(count>=n) break;
                D[count]=BC[k].c;
                count++;
                

            }
        }

        Arrays.sort(A);


        for(i=0;i<n;i++){
            if(A[i]<=D[i]) A[i]=D[i];
        }
        

        long sum = 0;
        for(long d : A){
        sum += d;
        }
        System.out.print(sum);
        
        
     
    }

    static class BandC{
        int b,c;

        BandC(int b,int c){
            this.b=b;
            this.c=c;
        }
    }

    static class SortBandC implements Comparator<BandC>{
        public int compare(BandC bc1,BandC bc2){
            return bc2.c-bc1.c;
        }
    }

}

