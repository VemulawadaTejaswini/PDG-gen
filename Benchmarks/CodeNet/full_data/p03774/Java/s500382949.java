       import java.util.*;
      class Main{
          public static void main(String[]args){
              Scanner cin=new Scanner(System.in);
              int numS;
              int numC;
              int count;
              int kx;
              int ky;
              int result;
              int temp;
             
              numS = cin.nextInt();
              numC = cin.nextInt();
              int student[] = new int[2*numS];
              int checkp[] = new int[2*numC];
              count = 0;
              for(int i=0;i<numS;i++ ){
                  student[count]=cin.nextInt();
                  count++;
                 student[count]=cin.nextInt();
                  count++;
             }
              count = 0;
              for(int j=0;j<numC;j++ ){
                  checkp[count]=cin.nextInt();
                  count++;
                  checkp[count]=cin.nextInt();
                  count++;
              }
              for(int k=0;k<numS;k++){
                  kx = student[2*k];
                  ky = student[2*k+1];
                  result = 0;
                  temp = 900000000;
                  for(int m=0;m<numC;m++){
                      if(temp > Math.abs(kx-checkp[2*m])+Math.abs(ky-checkp[2*m+1])){
                          temp = Math.abs(kx-checkp[2*m])+Math.abs(ky-checkp[2*m+1]);
                          result = m+1;
                       }
                  }    
                  System.out.println(result);
              }
          }
      }
