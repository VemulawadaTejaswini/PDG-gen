import java.util.*;
public class Main{
public static void main(String[]args){
  Scanner sc=new Scanner(System.in);
  int n=sc.nextInt();
    int m=sc.nextInt();
  int po[][]=new int[n][n];
  int p[][]=new int[m][m];
  for(int i=0;i<n;i++){
  String a=sc.next();
    String []s=a.split("",0);
    for(int j=0;j<n;j++){
      po[i][j]=(s[j].equals("#"))?1:0;
    }
  }
  for(int i=0;i<m;i++){
  String a=sc.next();
    String []s=a.split("",0);
    for(int j=0;j<m;j++){
      p[i][j]=(s[j].equals("#"))?1:0;
    }
  }
  boolean b=false;
  for(int i=0;i<n-m+1;i++){
  for(int j=0;j<n-m+1;j++){
  boolean check=true;
    for(int k=i;k<i+m;k++){
    for(int l=j;l<i+m;l++){
    if(po[k][l]!=p[k-i][l-j]){
    check=false;break;
    }
    }
    }
    if(check){b=true;break;}
  }
    if(b)break;
  }
  System.out.println(b?"Yes":"No");
}

}
