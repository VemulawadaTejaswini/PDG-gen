#include<iostream>
#include<algorithm>
using namespace std;
int vis[1000005];
void solve()
{
    vis[1] = 0;
    vis[2] = 0;
    for(int i = 2;i <= 1000000;i++)
    {
        if(vis[i] == 0)
        {
            int t = 2;
            for(int j = t * i;j <= 1000000;j = t * i)
            {
                vis[j] = 1;
                t++;
            }
        }
    }
}
int main()
{
    long long a,b;
    solve();
    cin >> a >> b;
    int cnt = 1;
    for(int i = 2;i <= 1000000;i++)
    {
        if(a % i == 0 && b % i == 0 && vis[i] == 0)
        {
            //cout << i << endl;
            cnt++;
            if(i >= a / 2 || i >= b / 2)
                break;
        }
    }
    cout << cnt << endl;
    return 0;
}
