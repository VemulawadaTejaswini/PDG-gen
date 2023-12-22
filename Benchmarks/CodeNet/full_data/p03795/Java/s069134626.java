public class Main{
 
 public static void main(String[] args){
  int eatLunch = 0;
  int price = 0;
  Scanner sc = new Scanner(System.in);
  
  while(true){
  eatLunch = sc.nextInt();
  if(eatLunch =< 100){
    break;
  }
  }
  
  price = eatLunch * 800;
 
  if(eatLunch =< 15){
    price = price - ((eatLunch / 15) * 200);
  }
 
  System.out.println(price);
}
}