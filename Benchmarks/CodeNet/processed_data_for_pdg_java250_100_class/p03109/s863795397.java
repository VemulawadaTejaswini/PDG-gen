class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int s1 = Integer.parseInt(s.substring(5,7));
    if(s1>4){
      System.out.println("TBD");
    }else{
      System.out.println("Heisei");
    }
  }
}
