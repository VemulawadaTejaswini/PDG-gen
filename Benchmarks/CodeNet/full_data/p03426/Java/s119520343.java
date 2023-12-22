import java.util.*;
import java.lang.*;
import java.io.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int D = sc.nextInt();
        int A[][] = new int [H][W];
      
        for(int i=0;i<H;i++){
          for(int j=0;j<W;j++){
            A[i][j] = sc.nextInt();
          }
        }
      
        String h[] = new String [H];
        String w[] = new String [W];
        String hi = " ";
        String wi = " ";
      
        for(int i=0;i<H;i++){
          for(int j=0;j<W;j++)
            hi =hi + " " + A[i][j];
            h[i] = hi +" ";
            hi = " ";
        } //for
        for(int i=0;i<W;i++){
          for(int j=0;j<H;j++)
            wi = wi + " " + A[j][i];
            w[i] = wi +" ";
            wi = " ";
        } //for
      
        int Q = sc.nextInt();
        int L[] = new int [Q];
        int R[] = new int [Q];
        int t[] = new int [Q];
        int cost[] = new int [Q];
        int Kari = 0;
        int Kari2 = 0;
        int Ph[][] = new int [Q][H*W];
        int Pw[][] = new int [Q][H*W];
        int test;
      
        for(int i=0;i<Q;i++){
          L[i] = sc.nextInt();
          R[i] = sc.nextInt();
          t[i] = (R[i]-L[i]) / D ;
          if(t[i] == 0)
            cost[i]=0;
          else{
            for(int k=0;k<=t[i];k++){
              Kari = L[i]+k*D;
              for(int l=0;l<H;l++){
//               System.out.println(h[l].indexOf(" "+Kari+" ") +" i="+ i +" k="+ k +" l="+l +" Kari="+Kari+" h[l]="+h[l]); //test
                if(h[l].indexOf(" "+Kari+" ") != -1){
                  Ph[i][k] = l;
//                  System.out.println(l); //test
                  break ;
                }
              } //for
              for(int l=0;l<W;l++){
                if(w[l].indexOf(" "+Kari+" ") != -1){
                  Pw[i][k] = l;
                  break ;
                }
              } //for
            } //for
            for(int k=0;k<t[i];k++){
              Kari2 = Kari2 + Math.abs(Ph[i][k+1]-Ph[i][k]) + Math.abs(Pw[i][k+1]-Pw[i][k]);
            } //for
            cost[i] = Kari2;
            Kari2 = 0;
          } //else
        System.out.println(cost[i]);
        } //for
      

         
	}

}
