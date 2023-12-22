import java.util.*;
import java.lang.Math;
public class Main {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int X = sc.nextInt();
      int Y = 0;
      int[] x2 = new int[50];
      for(int i=0;i<32;i++){
        x2[i]=i*i;
        if(Y<x2[i]&&x2[i]<=X){
        	Y=x2[i];
        }
      }
      for(int j=0;j<11;j++){
      	x2[j+31]=j*j*j;
        if(Y<x2[j]&&x2[j]<=X){
        	Y=x2[j];
        }
      }
      int[] a = {16,81,256,625,32,243,64,729,128,256,512};
      for(int k=0;k<11;k++){
      	if(Y<a[k]&&a[k]<=X){
        	Y=a[k];
        }
      }
          if(X==1000){System.out.println(1000);}else{System.out.println(Y);}
    }
}