public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
      long X = sc.nextLong();
      long money = 100;
      long year =0; 
      while(money<X){
       money *= 1.01;
       year =year+1;
      }
      System.out.println(year);
    }
}
