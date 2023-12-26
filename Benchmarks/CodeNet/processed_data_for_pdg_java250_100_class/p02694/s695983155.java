public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long N = sc.nextLong();
    sc.close();
    long now =100;
    int c = 0;
    while(N>now){
      now = now + now/100;
      c++;
    }
    System.out.println(c);  
  }
}
