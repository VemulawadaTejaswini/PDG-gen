public class Main {
  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int[] list = {a,b,c};
    int x=0;
      Arrays.sort(list);
      for(int i: list){
      System.out.print(i);
      if(x<2){
          System.out.print(" "); 
          x++;
      }
     }
     System.out.println();
    sc.close();
  }
}
