#include <iostream>
#include<string.h>
using namespace std;

int main()
{
string S;
cin>>S;
 if (S.compare("SUN")==0){
     cout<<7;}
 else if(S.compare("MON")==0){

     cout<<6;}
 else if(S.compare("TUE")==0){
     cout<<5;}
else if(S.compare("WED")==0){
     cout<<4;}
 else if(S.compare("THU")==0){
     cout<<3;}
 else if(S.compare("FRI")==0){
     cout<<2;}
 else if(S.compare("SAT")==0){
     cout<<1;
    }

    return 0;
}
