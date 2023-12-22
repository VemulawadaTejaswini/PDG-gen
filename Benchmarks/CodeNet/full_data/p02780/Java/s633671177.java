import java.util.Scanner;
public class Main{
  public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();
    int[] p = new int[N];
    for(int i =0; i<N; i++)
      p[i] = sc.nextInt();
    int maxScore = 0;
    double avgScore = 0;
    int maxNumber = 0;  //最大となる組み合わせの先頭
	
    //期待値が最大となる組み合わせを探す
    for(int i=0; i< N - (K - 1); i++){
    	int score = p[i] + p[i+1] + p[i+2];
        if(maxScore < score) {maxScore = score; maxNumber = i;}
    }
    for(int i=0; i<3; i++){
    	double avg = (p[maxNumber + i] + 1) / 2.0 + (p[maxNumber + i] + 1) % 2.0;
        avgScore += avg;
    }
    System.out.println( avgScore);

  }
}
