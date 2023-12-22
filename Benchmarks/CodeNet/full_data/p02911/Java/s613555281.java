import java.util.Scanner;
 
class Main{
  public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    int people=scan.nextInt();
    int po=scan.nextInt();
    int prob=scan.nextInt();
    int[] pronum=new int[prob];
    int[] point=new int[people];
    for(int a=0;a<prob;a++){
      pronum[a]=scan.nextInt();
    }
    for(int a=0;a<people;a++){
      point[a]=po;
    }
    for(int a=0;a<prob;a++){
      for(int b=0;b<people;b++){
        if(!(b+1==pronum[a])){
          point[b]--;
        }
      }
    }
    for(int a=0;a<point.length;a++){
      if(point[a]>0){
        System.out.println("Yes");
      }else{
        System.out.println("No");
      }
    }
  }
}