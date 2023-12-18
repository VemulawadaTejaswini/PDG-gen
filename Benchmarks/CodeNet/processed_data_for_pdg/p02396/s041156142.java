public class Main{
  public static void main(String [] args){ 
    Scanner sc=new Scanner(System.in);
    int count=1;
    while(count<=10000){
      int x=sc.nextInt();
      System.out.println("Case "+count+": "+x);
      count++;
    }
  }
}
