import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  	Scanner in = new Scanner(System.in);

  	int A = in.nextInt();
  	int B = in.nextInt();
  	int C = in.nextInt();
  	int D = in.nextInt();
  	// 100gあたり溶ける砂糖のmax
  	int E = in.nextInt();
  	// 水と佐藤の質量の合計制限値
  	int F = in.nextInt();

  	int sum = 0;
  	int mizu = 0;
  	int sato = 0;
  	double max = 0.0;

  	while((sum <= F)&&(sato <= E * A * 100)){
  		mizu = A*100 + mizu;
  		sato = sato + C;
  		sum = mizu + sato;
  		int tmp = ( 100 * mizu )/(mizu + sato);
  		if(max < tmp){
  			max = tmp;
  		}

  	}
  	System.out.println(sum+" "+sato);
  }


}