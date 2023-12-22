#include <cstdio>
using namespace std;
int N,P,cur,t=1,cnt[10010],i;char S[200010];long long ans;
int main()
{
    scanf("%d%d%s",&N,&P,S);
    if(P==2||P==5){
        for(i=0;i<N;i++)if((S[i]-'0')%P==0)ans+=i+1;
    }else{、
    /*
    类似dp
    记录下由s[i]到字符串末尾形成的这个数字%p的余数，如果之前有cnt个串也等于这个余数
    那么相减之后就%p为0，因此ans+=cnt
    */
        cnt[0]=1;
        for(i=N-1;i>=0;i--){
            (cur+=(S[i]-'0')*t)%=P;
            ans+=cnt[cur]++;
            t=t*10%P;
        }
    }
    printf("%lld",ans);
}
