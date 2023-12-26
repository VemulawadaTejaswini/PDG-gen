class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    String[] al = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
    for (int i = 0;i < 26;i++) {
      if (a.equals(al[i])) {
        System.out.println("a");
        return;
      }  
    }
    System.out.println("A");
  }
}
