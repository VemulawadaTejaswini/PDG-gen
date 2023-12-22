public class Sample {

  public static void main(String[] args) {

    // 引数で標準入力System.inを指定する
    Scanner scanner = new Scanner(System.in);
	int N = scanner.nextInt()
    int result = 0
    
    if(N != 1){
      result = N * (N - 1) / 2
    }
    print(result)

  }

}