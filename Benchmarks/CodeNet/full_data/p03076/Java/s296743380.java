import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int Ds[]=new int[5];
    int result=0;
    int sa=10;
    Ds[0]=sc.nextInt();
    Ds[1]=sc.nextInt();
    Ds[2]=sc.nextInt();
    Ds[3]=sc.nextInt();
    Ds[4]=sc.nextInt();




    for(int k=0;k<5;k++){
      if(Ds[k]%10<sa&&!(Ds[k]%10==0)){
        sa=Ds[k]%10;
      }
    }
    for(int j=0;j<5;j++){
      if(Ds[j]%10==0){
        result+=Ds[j];
      }else{
        while(!(Ds[j]%10==0)){
          Ds[j]++;
        }
        result+=Ds[j];
      }
    }
    System.out.println(result-10+sa);
  }
}
