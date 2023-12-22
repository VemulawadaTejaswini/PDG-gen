public static void main(String[] args) {
  // 入力された値をすべてスキャン
  Scanner sc = new Scanner(System.in);

  // 一行目の値を得る
  String line = sc.nextLine();

  // 半径rを取得
  int r = Integer.parseInt(line);

  // r*r(答え)を出力
  System.out.println(r * r);

  // Scannerを閉じる
  sc.close();
}