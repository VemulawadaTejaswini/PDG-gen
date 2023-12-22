#include<bits/stdc++.h>
using namespace std;
int main()
{
    int ar[26],i;
    string s;
    cin>>s;

    for(i=0;i<26;i++){
        ar[i]=0;  // a=0, b=1 ,z=26 ;
    }

    //counting sort

    for(i=0;i<s.size();i++){
        int p=s[i]-97;
        ar[p]++;
    }

   string ans = "Yes";
  for (int i = 0;i < 26;i++){
    if (ar[i]%2!=0){
      ans = "No";
      break;
  }


}
cout << ans <<endl;
}

