public class Main{
  public static void main(String[] args){
    Scanner amir=new Scanner(System.in);
    int a=amir.nextInt();
    int b=amir.nextInt();
    int area=a*b;
    int perimeter=2*(a+b);
    System.out.println(area+" "+perimeter);
  }
}
