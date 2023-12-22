import java.util.Scanner;
  class main{

    public static void Main(String[] args){
      String[] a;
      a = new String[4];

      for(int i=0;i<=3;i++){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        a[i]=n;
      }
      int q=0;
      int z=0;
      int x=0;

      for(int f=0;f<=0;f++){
        if(a[f]==a[0]){
        System.out.print("Yes");
        break;
        }else if(a[f]==a[1]){
        System.out.print("Yes");
        break;
        }else if(a[f]==a[2]){
        System.out.print("Yes");
        break;
        }else if(a[f]==a[3]){
        System.out.print("Yes");
        break;
        }else{
        System.out.print("No");
        break;
      }
     }
  }
}