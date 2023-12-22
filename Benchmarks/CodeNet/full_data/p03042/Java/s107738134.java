#include<bits/stdc++.h>
using namespace std;
#define ll long long
#define pb push_back

bool check(int n)
{
	if(n>=1 && n<=12)
		return true;
	return false;
}

int main()
{
	ios_base::sync_with_stdio(false);
	cin.tie(NULL);

	string S;
	cin>>S;

	string S1,S2;

	for(int i = 0;i<4;i++)
	{
		if(i == 0 || i == 1)
			S1 = S1 + S[i];
		else
			S2 = S2 + S[i];
	}

	//cout<<S1<<" "<<S2<<endl;

	int a = stoi(S1);
	int b = stoi(S2);

	if(check(a) && check(b))
		cout<<"AMBIGUOUS"<<endl;
	else if(check(a))
		cout<<"MMYY"<<endl;
	else if(check(b))
		cout<<"YYMM"<<endl;
	else
		cout<<"NA"<<endl;

	return 0;
} 