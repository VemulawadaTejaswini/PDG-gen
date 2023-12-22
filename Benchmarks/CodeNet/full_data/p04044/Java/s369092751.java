#include<iostream>
#include<cstdio>
#include<cstring>
#include <algorithm>

using namespace std;

int main() {
    string arr[102];
    int n,m;
    while(scanf("%d%d",&n,&m) != EOF ) {
        for(int i = 0;i < n;i++) {
            cin>>arr[i];
        }
//        for(int i = 0;i < n;i++) {
//            for(int j  = 0;j < n;j++) {
//                if(arr[i]<arr[j]) {
//                    string str = arr[i];
//                    arr[i] = arr[j];
//                    arr[j] = str;
//                }
//            }
//        }
        sort(arr,arr+n);
        for(int i = 0;i < n;i++) {
            cout<<arr[i];
        }
        cout<<endl;
    }
    return 0;
}