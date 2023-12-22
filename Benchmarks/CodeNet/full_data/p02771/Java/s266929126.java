#include <iostream>

using namespace std;

int main() {
    int a,b,c;
    cin>>a>>b>>c;
    int u,v,w;
    u=a-b;
    v=b-c;
    w=c-a;
    if(u==0||v==0||w==0)
    {
        if(u==0&&v==0&&w==0)
        {
            cout<<"No"<<endl;
        }
        else
        {
            cout<<"Yes"<<endl;
        }
    }
    else
    {
        cout<<"No"<<endl;
    }
}