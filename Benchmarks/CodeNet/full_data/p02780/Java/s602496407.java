



import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] p = new int[N];
    for(int i =0; i<K-1; i++)
     p[i] = sc.nextInt();
    double maxAverage = 0;
    double avgScore = 0;
	
    //期待値が最大となる組み合わせを探す
    for(int i=0; i< N - (K - 1); i++){
      	p[i + (K-1)] =sc.nextInt();
        double average = 0;
        for(int j=0; j<K; j++)
           average += (p[i+j] + 1) / 2.000000;
        if(maxAverage < average) maxAverage = average;
    }
    System.out.println(maxAverage);
  }
}
