public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    int total = 0;
    total += 700;
    for(int i = 0; i<3; i++){
      if(s.charAt(i) == 'o'){
        total += 100; 
      }
    }
    System.out.println(total);
  }
}