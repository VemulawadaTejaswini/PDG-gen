public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int answer1 = a*b;
    int answer2 = 2*a+2*b;
    System.out.println(answer1 + " " + answer2);
    sc.close();
  }
}
