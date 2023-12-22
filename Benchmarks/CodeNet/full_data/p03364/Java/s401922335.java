import java.util.*;

public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
int N = sc.nextInt();
int answer=0;
char[][] input = new char[N][N];
char[][] output = new char[N][N];
boolean[][] count = new boolean[N][N];
for(int j=0;j<N;j++){
  String s=sc.next();
  for(int i=0;i<N;i++){
    count[i][j]=true;
char[] carr = s.toCharArray();
    input[i][j]=carr[i];
  }
}
for(int A=0;A<N;A++){
  for(int B=0;B<N;B++){
    for(int j=0;j<N;j++){
      for(int i=0;i<N;i++){
        output[(i+A)%N][(j+B)%N]=input[i][j];
      }
    }
    outer:for(int j=0;j<N;j++){
      for(int i=0;i<j;i++){
        if(output[i][j]!=output[j][i])
        count[A][B]=false;
        break outer;
      }
    }
  }
}
for(int j=0;j<N;j++){
  for(int i=0;i<N;i++){
    if(count[i][j])
    answer++;
  }
}
System.out.println(answer);
}
}
