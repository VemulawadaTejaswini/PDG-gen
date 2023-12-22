import java.util.*;
public class Main {
public static void main(String[] args){
Scanner sc = new Scanner(System.in);
String S=sc.next();
int N=S.length();
int[] a=new int[N+1];
int[] b=new int[N+1];
int[] c=new int[N+1];
int[] d=new int[N+1];
int[] e=new int[N+1];
int[] f=new int[N+1];
int[] g=new int[N+1];
int[] h=new int[N+1];
int[] i=new int[N+1];
int[] j=new int[N+1];
int[] k=new int[N+1];
int[] l=new int[N+1];
int[] m=new int[N+1];
int[] n=new int[N+1];
int[] o=new int[N+1];
int[] p=new int[N+1];
int[] q=new int[N+1];
int[] r=new int[N+1];
int[] s=new int[N+1];
int[] t=new int[N+1];
int[] u=new int[N+1];
int[] v=new int[N+1];
int[] w=new int[N+1];
int[] x=new int[N+1];
int[] y=new int[N+1];
int[] z=new int[N+1];
a[0]=0;
b[0]=0;
c[0]=0;
d[0]=0;
e[0]=0;
f[0]=0;
g[0]=0;
h[0]=0;
i[0]=0;
j[0]=0;
k[0]=0;
l[0]=0;
m[0]=0;
n[0]=0;
o[0]=0;
p[0]=0;
q[0]=0;
r[0]=0;
s[0]=0;
t[0]=0;
u[0]=0;
v[0]=0;
w[0]=0;
x[0]=0;
y[0]=0;
z[0]=0;
//データ取得
for(int ii=1;ii<=N;ii++){
if(S.charAt(ii-1)=='a')a[ii]++;
if(S.charAt(ii-1)=='b')b[ii]++;
if(S.charAt(ii-1)=='c')c[ii]++;
if(S.charAt(ii-1)=='d')d[ii]++;
if(S.charAt(ii-1)=='e')e[ii]++;
if(S.charAt(ii-1)=='f')f[ii]++;
if(S.charAt(ii-1)=='g')g[ii]++;
if(S.charAt(ii-1)=='h')h[ii]++;
if(S.charAt(ii-1)=='i')i[ii]++;
if(S.charAt(ii-1)=='j')j[ii]++;
if(S.charAt(ii-1)=='k')k[ii]++;
if(S.charAt(ii-1)=='l')l[ii]++;
if(S.charAt(ii-1)=='m')m[ii]++;
if(S.charAt(ii-1)=='n')n[ii]++;
if(S.charAt(ii-1)=='o')o[ii]++;
if(S.charAt(ii-1)=='p')p[ii]++;
if(S.charAt(ii-1)=='q')q[ii]++;
if(S.charAt(ii-1)=='r')r[ii]++;
if(S.charAt(ii-1)=='s')s[ii]++;
if(S.charAt(ii-1)=='t')t[ii]++;
if(S.charAt(ii-1)=='u')u[ii]++;
if(S.charAt(ii-1)=='v')v[ii]++;
if(S.charAt(ii-1)=='w')w[ii]++;
if(S.charAt(ii-1)=='x')x[ii]++;
if(S.charAt(ii-1)=='y')y[ii]++;
if(S.charAt(ii-1)=='z')z[ii]++;

a[ii]=a[ii]+a[ii-1];
b[ii]=b[ii]+b[ii-1];
c[ii]=c[ii]+c[ii-1];
d[ii]=d[ii]+d[ii-1];
e[ii]=e[ii]+e[ii-1];
f[ii]=f[ii]+f[ii-1];
g[ii]=g[ii]+g[ii-1];
h[ii]=h[ii]+h[ii-1];
i[ii]=i[ii]+i[ii-1];
j[ii]=j[ii]+j[ii-1];
k[ii]=k[ii]+k[ii-1];
l[ii]=l[ii]+l[ii-1];
m[ii]=m[ii]+m[ii-1];
n[ii]=n[ii]+n[ii-1];
o[ii]=o[ii]+o[ii-1];
p[ii]=p[ii]+p[ii-1];
q[ii]=q[ii]+q[ii-1];
r[ii]=r[ii]+r[ii-1];
s[ii]=s[ii]+s[ii-1];
t[ii]=t[ii]+t[ii-1];
u[ii]=u[ii]+u[ii-1];
v[ii]=v[ii]+v[ii-1];
w[ii]=w[ii]+w[ii-1];
x[ii]=x[ii]+x[ii-1];
y[ii]=y[ii]+y[ii-1];
z[ii]=z[ii]+z[ii-1];
}

for(int I=1;I<=N;I++){
    for(int J=I+1;J<=N;J++){
        if((a[J]-a[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((b[J]-b[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((c[J]-c[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((d[J]-d[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((e[J]-e[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((f[J]-f[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((g[J]-g[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((h[J]-h[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((i[J]-i[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((j[J]-j[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((k[J]-k[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((l[J]-l[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((m[J]-m[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((n[J]-n[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((o[J]-o[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((p[J]-p[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((q[J]-q[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((r[J]-r[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((s[J]-s[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((t[J]-t[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((u[J]-u[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((v[J]-v[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((w[J]-w[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((x[J]-x[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((y[J]-y[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
        
        if((z[J]-z[I-1])*2>J-I+1){
        System.out.println(I+" "+J);System.exit(0);
        }
    }
}

System.out.println("-1 -1");

}
}