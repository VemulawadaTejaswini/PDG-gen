#include <bits/stdc++.h>
using namespace std;
#define ll long long
#define mp make_pair
#define pb push_back
#define x first
#define y second
#define pii pair<int, int>
#define p3i pair<pii, int>
#define pll pair<ll, ll>
#define p3l pair<pll, ll>
#define vi vector<int>
#define vpii vector<pii>
#define vp3i vector<p3i>
#define vpll vector<pll>
#define vp3l vector<p3l>
#define lseg L, (L+R)/2, N*2+1
#define rseg (L+R)/2+1, R, N*2+2
#define ub upper_bound
#define lb lower_bound
#define pq priority_queue
#define MN 1000000007
#define fox(k, x) for (int k=0; k<x; ++k)
#define fox1(k, x) for (int k=1; k<=x; ++k)
#define foxr(k, x) for (int k=x-1; k>=0; --k)
#define fox1r(k, x) for (int k=x; k>0; --k)
#define ms multiset
#define flood(x) memset(x, 0x3f3f3f3f, sizeof x)
#define drain(x) memset(x, 0, sizeof x)
#define rng() ((rand() << 14)+rand())
#define scan(X) do{while((X=getchar())<'0'); for(X-='0'; '0'<=(_=getchar()); X=(X<<3)+(X<<1)+_-'0');}while(0)
char _;
#define pi 3.14159265358979323846

int n, m, psa[200][200], dp[18][200][200][200];
char ch;
int32_t main(){
  scanf("%i%i", &n, &m);
  fox1(l, n){
    fox1(l2, m){
      scanf(" %c", &ch);
      psa[l][l2] = (ch=='#')+psa[l][l2-1];
      //psa2[l][l2] = (ch=='#')+psa[l-1][l2];
    }
  }
  flood(dp);
  fox1(l, n){
    fox1(l2, m){
      for(int l3 = l2; l3 <= m; ++l3){
        if (psa[l][l3] - psa[l][l2-1] == 0 || psa[l][l3] - psa[l][l2-1] == l3-l2+1){
          if (psa[l][l3] - psa[l][l3-1] != psa[l-1][l3] - psa[l][l3-1] || l == 1){
            dp[0][l][l2][l3] = l;
          } else {
            dp[0][l][l2][l3] = dp[0][l-1][l2][l3];
          }
        } else {
          dp[0][l][l2][l3] = l+1;
        }
      }
    }
  }
  fox(t, 19){
    /*cout << t << endl;
    fox1(l, n){
      fox1(l2, m){
        fox1(l3, m){
          printf("%i %i %i\n", l2, l3, dp[t][l][l2][l3]);
        }
      }
      printf("\n");
    }*/
    if (dp[t][n][1][m] <= 1){
      cout << t;
      return 0;
    }
    fox1(l, n){
      fox1(l2, m){
        int p = 1;
        for (int l3 = m; l3 >= l2; --l3){
          while(p <l2 && dp[t][l][p][l2-1] > dp[t][l][l2][l3]) ++p;
          dp[t+1][l][p][l3] = min(dp[t+1][l][p][l3], dp[t][l][l2][l3]);
        }
      }
      fox1(l2, m){
        int p = m;
        for (int l3 = 1; l3 <= l2; ++l3){
          while(p > l2 && dp[t][l][l2+1][p] > dp[t][l][l3][l2]) --p;
          dp[t+1][l][l3][p] = min(dp[t+1][l][l3][p], dp[t][l][l3][l2]);
        }
      }
      fox1(l2, m){
        for (int l3 = l2; l3 <= m; ++l3){
          if (dp[t][l][l2][l3] == 1) dp[t+1][l][l2][l3] = 1;
          else dp[t+1][l][l2][l3] = min(dp[t+1][l][l2][l3], dp[t][dp[t][l][l2][l3]-1][l2][l3]);
        }
      }
    }
  }
  return 0;
}
