public class Main{
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String temp;
      int i = 1;
      while(true){
         temp = sc.nextLine();
         if(temp.equals("0")){
            break;
         }else{
            System.out.println("Case " + i + ": " + temp );
            i ++;
         }
      }
   }
}
