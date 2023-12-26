public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      long N = sc.nextLong();
      long A = sc.nextLong();
      long B = sc.nextLong();
      long roop = N / (A+B);
      long remain = N % (A+B);
      long result = A * roop;
      if(remain < A){
        result += remain;
      }else{
        result += A;
      }
      System.out.println(result);
    }
}
