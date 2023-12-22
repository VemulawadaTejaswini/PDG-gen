#include<iostream>
using namespace std;

int main(){
    int n;
    cin>>n;
    if(n%2==0){
        cout<<0.5<<endl;
    }
    else{
        int x=n/2+1;
        double y=x;
        printf("%lf\n",y/n);
    }
    return 0;
}