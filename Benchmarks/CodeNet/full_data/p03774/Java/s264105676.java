1. import java.util.*;
2. class Main{
3.     public static void main(String[]args){
4.         Scanner cin=new Scanner(System.in);
5.         int numS;
6.         int numC;
7.         int count =0;
8.         int kx;
9.         int ky;
10.       int result;
11.       int temp;
12.         
13.         numS = cin.nextInt();
14.         numC = cin.nextInt();
15.         int student[] = new int[numS];
16.         int checkp[] = new int[numC];
17.         for(int i=0;i<numS;i++ ){
18.             student[count]=cin.nextInt();
19.             count++;
20.             student[count]=cin.nextInt();
21.             count++;
22.         }
23.         count = 0;
24.         for(int j=0;j<numC;j++ ){
25.             checkp[count]=cin.nextInt();
26.             count++;
27.             checkp[count]=cin.nextInt();
28.             count++;
29.         }
30.         for(int k=0;k<numS;k++){
31.             kx = student[2*k];
32.             ky = student[2*k+1];
33.             result = 0;
34.             temp = 900000000;
35.             for(int m=0;m<numC;m++){
36.                 if(temp < Math.abs(kx-checkp[2*m])+Math.abs(ky-checkp[2*m+1])){
37.                     temp = Math.abs(kx-checkp[2*m])+Math.abs(ky-checkp[2*m+1]);
38.                     result = m;
39.                  }
40.             }    
41.             System.out.println(result);
42.         }
43.     }
44. }
