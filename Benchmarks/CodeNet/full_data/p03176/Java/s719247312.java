// Author : Rifayat Samee (Sanzee)
// Problem :
// Algorithm:

/*

*/
#include <bits/stdc++.h>
using namespace std;
typedef long long ll;
const int maxval = 200005;
ll tree[4*maxval+5];
void make_tree(int i,int low,int high,const vector<int>&A){
    if(low == high){
        tree[i] = 0;
        return;
    }
    int mid = (low + high) / 2;
    make_tree(2*i,low,mid,A);
    make_tree(2*i+1,mid+1,high,A);
    tree[i] = max(tree[2*i],tree[2*i+1]);
}
void update(int i,int low,int high,ll val,ll h,const vector<int>&A){
    if(low == high){
        tree[i] = val;
        return;
    }
    int mid = (low + high)/2;
    if(h <=mid) update(2*i,low,mid,val,h,A);
    else
        update(2*i+1,mid+1,high,val,h,A);
    tree[i] = max(tree[2*i],tree[2*i+1]);
}
ll query(int i,int low,int high,int a,int b){
    if(high < a || low > b) return 0;
    if(low>=a && high <=b){
        return tree[i];
    }
    int mid = (low + high)/2;
    return max(query(2*i,low,mid,a,b),query(2*i+1,mid+1,high,a,b));
}
int main(){

	//freopen("in.txt","r",stdin);
	//freopen("out.txt","w",stdout);
    int n;
    scanf("%d",&n);
    vector<int>H(n+1);
    vector<int>A(n+1);
    int maxh = 0;
    for(int i=0;i<n;i++){
        scanf("%d",&H[i]);
        maxh = max(maxh,H[i]);
    }
    for(int i=0;i<n;i++){
        scanf("%d",&A[i]);
    }
    make_tree(1,0,maxh,A);
    ll res = 0;
    for(int i=0;i<n;i++){
        ll h = H[i];
        ll val = query(1,0,maxh,0,h-1);
        res = max(res,A[i]+val);
        update(1,0,maxh,val+A[i],h,A);
    }
    printf("%lld\n",res);
	return 0;
}
