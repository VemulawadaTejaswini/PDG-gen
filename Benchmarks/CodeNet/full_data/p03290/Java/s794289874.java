import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
int score = 0;
int num = 0;
		int D = sc.nextInt();
int G = sc.nextInt();
int[] p = new int[D];
int[] c = new int[D];
for(int i = 0; i < D; ++i){
p[i] = sc.nextInt();
c[i] = sc.nextInt();
}

int[] compScore = new int[D];
for(int i = 0;i < D;++i)
compScore[i] = 100*(i+1)*p[i] + c[i];

while(score < G){
boolean flag = true;
for(int i = 0; i < D; ++i)
if(compScore[i] < G -score)
flag = false;

if(flag){
int max = 0;
int maxIdx = 0;
for(int i = 0;i < D;++i){
if(max < compScore[i]){
max = compScore[i];
maxIdx = i;
}
}
score += compScore[maxIdx];
num += p[maxIdx];
compScore[maxIdx] = 0;
}else{
for(int i = D-1; i >= 0; --i){
if(compScore[i] == 0)continue;
int shotage = G - score;
score += shotage;
num += shotage / (100 * (i+ 1));
}


}

}

System.out.println(num);
	}
}