#include <bits/stdc++.h>
#include<algorithm>
#include<math.h>
#include<string>
#include<iostream>
#include <vector>
#include <cstdlib>
using namespace std;
 
template <class T> using V = vector<T>;

template<class T> inline bool chmin(T& a, T b) {
    if (a > b) {
        a = b;
        return true;
    }
    return false;
}
template<class T> inline bool chmax(T& a, T b) {
    if (a < b) {
        a = b;
        return true;
    }
    return false;
}

const long long INF = 1LL << 60;
 
using ll = long long;
using db = double;
using st = string;
using ch = char;
using bl = bool;
using vll = V<ll>;
using vpll =V<pair<ll,ll>>;
using vst = V<st>;
using vdb = V<db>;
using vch = V<ch>;
using vbl = V<bl>;
 
 
#define FOR(i,a,b) for(ll i=(a);i<(b);i++)
#define rFOR(i,a,b) for(ll i=(a);i>(b);i--)
#define oFOR(i,a,b) for(ll i=(a);i<(b);i+=2)
#define bgn begin()
#define en end()
#define SORT(a) sort((a).bgn,(a).en)
#define REV(a) reverse((a).bgn,(a).en)
#define M(a,b) max(a,b)
#define rM(a,b) min(a,b)
#define fi first
#define se second
#define sz size()
#define gcd(a,b) __gcd(a,b)
#define co(a) cout<<a<<endl;
#define ci(a) cin>>a;
 
 
ll sum(ll n) {
  ll m=0;
  FOR(i,0,20){
    m+=n%10;
    n/=10;
    if(n==0){
      break;
    }
  }
  return m;
}
 
 
ll combi(ll n,ll m) {
  ll ans=1;
  rFOR(i,n,n-m){
    ans*=i;
  }
  FOR(i,1,m+1){
    ans/=i;
  }
  return ans;
}
 
 
ll lcm(ll a,ll b){
  ll n;
  n=a/gcd(a,b)*b;
  return n;
}
 
 
/****************************************\
| Thank you for viewing my code:)        |
| Written by RedSpica a.k.a. RanseMirage |
| Twitter:@asakaakasaka                  | 
\****************************************/
 
 
signed main() {
  ll n;
  ci(n);
  vll A(n);
  FOR(i,0,n){
    ci(A[i]);
    A[i]-=i+1;
  }
  SORT(A);
  ll count=1;
  ll countA=0;
  ll b;
  FOR(i,1,n){
    if(A[i-1]==A[i]){
      count++;
    }
    else{
      if(countA<count){
        b=A[i-1];
        countA=count;
        count=1;
      }
    }
  }
  if(count<countA){
    countA=count;
    b=A[n-1];
  }
    ll sum=0;
    FOR(i,0,n){
      sum+=A[i];
    }
    if(countA==1){
      b=sum/2;
    }
    
    ll ans=0;
    FOR(i,0,n){
      ans+=abs(A[i]-b);
    }
    co(ans)
  }