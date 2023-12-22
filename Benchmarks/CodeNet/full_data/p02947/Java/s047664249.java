#include<bits/stdc++.h>
typedef long long int ll;
using namespace std;

string sort(string str){
  	map<char, int> count;
	for(int i=0;i<str.length();i++){
    	count[str[i]]++;
    }
  	string ans="";
  	for(auto itr=count.begin();itr!=count.end();itr++){
    	ans += string(itr->second, itr->first);
    }
  	return ans;
}

ll combination(ll num){
	return (num*(num-1LL))/2LL;
}

int main(){
	int n;cin>>n;
  	map<string, int> mp;
  	while(n--){
    	string s;cin>>s;
        mp[sort(s)]++;
    }
  	ll ans=0LL;
  	for(auto itr=mp.begin();itr!=mp.end();itr++){
    	ans += combination(itr->second);
    }
  	cout<<ans<<endl;
	return 0;
}