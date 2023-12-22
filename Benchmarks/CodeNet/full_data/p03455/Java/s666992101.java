#include<iostream>

using namespace std;

int main(){
  int n;
  int m;
  cin>>n;//読み込み
  cin>>m;
  //cout<<n<<endl;//System.out.println
  if(m*n%2==0){
    cout<<"Even"<<endl;
  }else{
    cout << "0dd" << endl;
  }
}
