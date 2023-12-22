class Main {
  public static void main(String[] args) {
    String S = "sippuu";
    String word3 = S.substring(2,3);
    String word4 = S.substring(3,4);
    String word5 = S.substring(4,5);
    String word6 = S.substring(5,6);
    System.out.println((word3 == word4) && (word5 == word6));
  }
}
      