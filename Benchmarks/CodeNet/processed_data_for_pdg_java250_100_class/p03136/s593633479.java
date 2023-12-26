public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int N =sc.nextInt();
      int max =0;
      int b = 0;
      for(int i=0; i<N; i++){
      int a =sc.nextInt();
        b = b+a;
        max = Math.max(max,a);
      }
      if(max<b-max){
      System.out.println("Yes");
      }
      else{
      System.out.println("No");
      }
    }
}
