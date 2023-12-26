public class Main{
   public static final String EOF = "END_OF_TEXT";
   public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      String keyWord = sc.nextLine().toLowerCase();
      int count = 0;
      String[] strArr;
      boolean exit = false;
      while(!exit){
         strArr = sc.nextLine().split(" ");
         for(int i = 0; i < strArr.length; i ++){
            if(strArr[i].equals(EOF)){
               exit = true;
               break;
            }
            if(strArr[i].toLowerCase().equals(keyWord)){
               count++;
            }
         }
      }
      System.out.println(count);
   }
}
