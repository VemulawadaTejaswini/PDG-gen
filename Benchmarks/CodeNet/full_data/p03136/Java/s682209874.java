public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // get a integer
        int a = sc.nextInt();
        // get two integers separated with half-width break
        //nt b = sc.nextInt();

        Scanner input = new Scanner(System.in);
        int[] numbers = new int[a];

        for (int i = 0; i < numbers.length; i++)
        {
            numbers[i] = input.nextInt();
        }
        input.close();
        System.out.println(totalMoves(numbers));
    }

    static boolean totalMoves(int x[]) {
        int biggest = 0;
        int sum = 0;
      for(int i = 0; i < x.length; i++) {
          if(x[i] > biggest) {
              biggest = x[i];
          }
          sum = sum + x[i];
      }

      sum = sum - biggest;
      if(sum > biggest) {
          return true;
      }

      return false;
    }

}