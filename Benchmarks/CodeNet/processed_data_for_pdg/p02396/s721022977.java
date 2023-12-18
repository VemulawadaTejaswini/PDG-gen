public class Main{
public static void main(String[] args) {
  int i=0,x;
  Scanner scan =new Scanner(System.in);
  while(true){
    x=scan.nextInt();
    i++;
    if(x==0)
    break;
  System.out.println("Case"+" "+i+":"+" "+x);
}
}
}
