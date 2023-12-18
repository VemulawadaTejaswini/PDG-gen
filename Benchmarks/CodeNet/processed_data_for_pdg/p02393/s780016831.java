public class Main{
  public static void main(String [] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt(), b=sc.nextInt(), c=sc.nextInt();
    int max=a, min=a, mid=a;
    if((b==c)||(a==b)||(a==c)){
      if(b==c){
        if(a>b){
          System.out.println(c+" "+b+" "+a);
        }
        else{
          System.out.println(a+" "+c+" "+b);
        }
      }
      else if(a==b){
        if(a<c){
          System.out.println(b+" "+a+" "+c);
        }
        else{
          System.out.println(c+" "+b+" "+a);
        }
      }
      else if(a==c){
        if(b>c){
          System.out.println(a+" "+c+" "+b);
        }
        else{
          System.out.println(b+" "+c+" "+a);
        }
      }
    }
    else{
      if(b>c){
        if(b>max){
          max=b;
        }
      }
      else{
        if((c>b)&&(c>max)){
          max=c;
        }
      }
      if(b<c){
        if(b<min){
          min=b;
        }
      }
      else{
        if((c<b)&&(c<min))
          min=c;
      }
      if((b>min)&&(b<max)){
        mid=b;
      }
      else if((c>min)&&(c<max)){
        mid=c;
      }
      System.out.println(min+" "+mid+" "+max);
    }
  }
}
