#include <bits/stdc++.h>

using namespace std;

int main(){
    int x;
    cin >> x;

    vector<int> vec;
    int cnt = 0;
    for(int i = 0; i < x; i++){
        int lover;
        cin >> lover; lover--;
        vec.push_back(lover);
        if(lover < i){
            if(i == vec.at(lover)){
                cnt++;
            }
        }
    }
    cout << cnt;
}