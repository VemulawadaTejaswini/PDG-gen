import java.util.Scanner;
  class Main{

    public static void main(String[] args){
      char[] a;
      a = new char[4];

      for(int i=0;i<=3;i++){
        Scanner sc = new Scanner(System.in);
        String w1 = sc.next();

        a[i]=w1.charAt(i);
      }
      int q=0;
      int z=0;


      for(int f=0;f<=0;f++){
        if(a[f]==a[0]){
        System.out.print("Yes");
        break;
        }else if(a[f]==a[1]){
        System.out.print("Yes");
        break;
        }else{
        System.out.print("No");
        break;
      }
     }
  }
}
