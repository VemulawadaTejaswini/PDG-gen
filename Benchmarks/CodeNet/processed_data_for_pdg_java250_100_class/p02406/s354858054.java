public class Main{
 public static void main(String[] args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
  if(3<=n&&n<=10000){
  for(int i=1;i<=n;i++){
    if(i%3==0)  
     System.out.printf(" "+i);
    else{
     int j=i;
     int count =0;
     do{
      if(j%10==3){
       System.out.printf(" "+i);
       count++;
     }
      else
       j/=10;
     }while(j>1&&count==0);   
    }
   }
  }
 System.out.printf("\n");
 }
}
