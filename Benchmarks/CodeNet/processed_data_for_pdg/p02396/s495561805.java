class Main{
 public static void main(String[] args){
  int x,i=0;
  Scanner scan = new Scanner(System.in);  
  while(true){
   i++;
   x=scan.nextInt();
   if(x==0){break;}
   System.out.println("Case "+i+": "+x);
  }
 }
}
