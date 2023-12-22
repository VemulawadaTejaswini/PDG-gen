import java.util.*;
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    double[] data = new double[1000];
    int v;
    double temp;
    double lenkin;

    for(int i = 0;i<N;i++){

      v  = sc.nextInt();

      data[i]=v;

    }


    for(int i = 0;i<N*(N-1)/2;i++){

      if(data[i]<data[i+1]){
        temp = data[i];
        data[i]=data[i+1];
        data[i+1]=temp;
      }

    }

    lenkin = (data[0]+data[1])/2;

    for(int i = 2;i<N;i++){
      lenkin = (lenkin+data[i])/2;
    }

    System.out.println(lenkin);

  }
}
