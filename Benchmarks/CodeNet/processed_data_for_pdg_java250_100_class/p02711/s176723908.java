public class Main {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int work;
      int digit100 = N / 100;
      work = N % 100;
      int digit10 = work / 10;
      int digit1 = work % 10;
      String result = "Yes";
      if(digit100 != 7 && digit10 != 7 && digit1 != 7){
        result = "No";
      }
      System.out.println(result);
    }
}
