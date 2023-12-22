class Main {
  public static void main(String[] args) {
    String S = "isppuu";
    String a3 = S.length(2,3);
    String a4 = S.length(3,4);
    String a5 = S.length(4,5);
    String a6 = S.length(5,6);
    System.out.println((a3.equals(a4))&&(a5.equals(a6)));
  }
}
