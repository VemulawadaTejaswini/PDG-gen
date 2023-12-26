public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = Integer.parseInt(sc.nextLine());
      String str;
      String[] arr;
      int[][] pc = new int[4][13];
      for(int i = 0; i < n; i++){
         str = sc.nextLine();
         arr = str.split(" ");
         if(arr[0].equals("S")){
            pc[0][Integer.parseInt(arr[1])-1] = 1;
         }else if(arr[0].equals("H")){
            pc[1][Integer.parseInt(arr[1])-1] = 1;
         }else if(arr[0].equals("C")){
            pc[2][Integer.parseInt(arr[1])-1] = 1;
         }else if(arr[0].equals("D")){
            pc[3][Integer.parseInt(arr[1])-1] = 1;
         }
      }
      String[] symbol = {"S", "H", "C", "D"};
      for(int suit = 0; suit < 4; suit ++ ){
         for(int number = 0; number < 13; number ++){
            if(pc[suit][number] == 0){
               System.out.print(symbol[suit] + " " + (number + 1) + "\n");
            }
         }
      }
   }
}
