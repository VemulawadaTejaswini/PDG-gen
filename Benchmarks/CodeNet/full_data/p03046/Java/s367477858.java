#include<iostream>
using namespace std;
int main(){
  int n,m;
  int target;
  int xor_sum=0;
  cin>>m>>target;
  
  n=1;
  for(int i=0;i<m;i++){
    n*=2;
  }
  for(int i=0;i<n;i++){
    xor_sum^=i;
  }
  
  bool success=false;
  for(int i=0;i<n&&!success;i++){
    if(i==target&&(xor_sum^i)==target){
      success=true;
    }
  }
  
  if(!success){
    cout<<-1<<endl;
  }else{
    for(int i=0;i<m;i++){
      if(i!=target){
	cout<<i<<' ';
      }
    }
    cout<<target<<' ';
    for(int i=m-1;i>=0;i--){
      if(i!=target){
	cout<<i<<' ';
      }
    }
    cout<<target<<endl;
  }
  return(0);
}
