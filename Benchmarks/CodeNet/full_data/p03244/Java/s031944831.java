import java.util.*;
public class Main{
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
  int n = sc.nextInt();
  int[] a = new int[n/2];
  int[] b = new int[n/2];
  int[] ac = new int[100001];
  int[] bc = new int[100001];
  for(int i = 0;i < n/2;i++){
    int p = sc.nextInt();
    a[i] = p;
    ac[p]++;
    int q = sc.nextInt();
    b[i] = q;
    bc[q]++;
  }
  int fa = 0;
  int sa = 0;
  int fb = 0;
  int sb = 0;
  int afk = 0;
  int ask = 0;
  int bfk = 0;
  int bsk = 0;
  for(int i = 1;i < 100001;i++) {
	  if(fa <= ac[i]) {
		  sa = fa;
		  fa = ac[i];
		  ask = afk;
		  afk = i;
	  }
     else if(sa <= ac[i]){
       sa = ac[i];
       ask = i;
     }
	 if(fb <= bc[i]) {
         sb = fb;
		  fb = bc[i];
		  bsk = bfk;
		  bfk = i;
	  }
    else if(sb <= bc[i]){
       sb = bc[i];
       bsk = i;
     }
  }
  if(afk != bfk) {
	  System.out.println(n - fa - fb);
  }
  else {
	  int s = n - fa - sb;
	  int t = n - sa - fb;
	  System.out.println(s >= t ? t:s);

  }
}}