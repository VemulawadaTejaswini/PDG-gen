public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
long N =sc.nextLong();
long A =sc.nextLong();
long B =sc.nextLong();
long cnt = 0;
long set = (long)(N/(A+B));
cnt = set*A;
if(N%(A+B) == 0){
  System.out.println(cnt);
}else{
  long ball =set*(A+B);
  if(N-ball >= A){
    System.out.println(cnt+A);
  }else{
    System.out.println(cnt+(N-ball));
  }
}
}
}
