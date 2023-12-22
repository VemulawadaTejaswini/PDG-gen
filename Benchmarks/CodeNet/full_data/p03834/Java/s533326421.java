public static void main(String args[]) {
  String a = args[0];

  // 置き換え処理
  a = a.replace(",", " "); // ","→" "(ブランク)に置き換える
  System.out.print(a);

}

