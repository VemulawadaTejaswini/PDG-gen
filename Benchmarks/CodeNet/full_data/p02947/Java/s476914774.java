import java.util.Scanner;

class Main{
  public static void main(String[] args){
    Scanner sc  = new Scanner(System.in);
   	int n = Integer.parseInt(sc.next());
    String[] strs = new String[n];
    int[][] strbit = new int[n][26];
    long sum = 0L;
    for(int i=0;i<n;i++){
      strs[i] = sc.next();
    }
    char ch;
    for(int i=0;i<n;i++){
      for(int j=0;j<10;j++){
        strbit[i][strs[i].charAt(j)-'a']++;
      }
    }
    int k;
    for(int i=0;i<n;i++){
      for(int j=i+1;j<n;j++){
        for(k=0;k<26;k++){
          if(strbit[i][k]!=strbit[j][k])break;
        }
        if(k==26)sum++;
      }
    }
    System.out.print(sum);
    System.out.flush();
  }
}