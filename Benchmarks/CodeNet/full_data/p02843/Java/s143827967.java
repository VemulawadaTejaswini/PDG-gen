import java.util.*;

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    
    double c = X/100;
    int C = (int)c;

    for(int i=0; i<C; i++){
       for(int j=0; j<C; j++){
          for(int k=0; k<C; k++){
             for(int l=0; l<C; l++){
                for(int m=0; m<C; m++){
                   for(int n=0; n<C; n++){
                      if(i*100 + j*101 + k*102 + l*103 + m*104 + n*105 == X){
                        System.out.pritnln(1);
                      }
                      else{
                        System.out.println(0);
                      }
                   }
                }
             }
          }
       }
    }
  }
}