#include <bits/stdc++.h>
using namespace std;

int main() {
    bool a=true;
    string s;
    cin>>s;
    for(int i=0;i<s.size();i++){
        if(i%2!=0){
            if(s.at(i)=='L' ||s.at(i)=='U'||s.at(i)=='D'){
            }else{
                a=false;
                break;
            }
        }else{
            if(s.at(i)=='R' ||s.at(i)=='U' || s.at(i)=='D'){
            }else{
                a=false;
                break;
            }
        }
    }
    if(a==true){
        cout<<"Yes"<<endl;
    }else{
        cout<<"No"<<endl;
    }
}
