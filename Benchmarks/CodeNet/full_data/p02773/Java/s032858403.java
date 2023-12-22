#include <bits/stdc++.h>
#include <iostream>
#include <list>
#include <string>
#include <algorithm>
using namespace std;

int main() {
    // 頂点数 (木なので辺数は N-1 で確定)
    int n;
cin >> n;
string data[n];
set<string> lists;
for(int i=0;i<n;i++){
 cin >> data[i];
lists.insert(data[i]);
}
sort(lists,lists+n);
vector<tuple<string,int>> c; 
int big=0;

map<string,int> ma;


for(string temp:lists){
int num=0;
int flag=0;
for(string datemp:data){
if(temp.compare(datemp)==0){num++;
flag=1;
}
if(flag==1 && temp.compare(datemp)==1){
flag=0;
break;
}
}
ma[temp]=num;
if(big<num)big=num;
}

vector<string> result; 

for(string temp:lists){

if(big==ma[temp])result.push_back(temp);
}


sort(result.begin(), result.end());

for(string te:result)
cout <<te <<"\n" ;

}