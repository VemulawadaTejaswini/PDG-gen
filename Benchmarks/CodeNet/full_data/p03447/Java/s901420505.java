//あなたは、X 円を持ってケーキとドーナツを買いに出かけました。

//あなたはまずケーキ屋で 1 個 A 円のケーキを 1 個買いました。 次に、ドーナツ屋で 1 個 B 円のドーナツをできるだけたくさん買いました。

//これらの買い物のあと手元に残っている金額は何円ですか。

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    int A , B , X ;   //1≤A,B≤1,000
                      //A+B≤X≤10,000
                      //X,A,B は整数である

    X = stdIn.nextInt();

    A = stdIn.nextInt();

    B = stdIn.nextInt();

    X = X - A;
    for (; X >= B ; ) {
      X = X - B;
    }
    System.out.println(X);
  }
}
