#include <iostream>

using namespace std;

int main()
{
	int n;
	string S, myString = "abcdefghijklmnopqrstuvwxyz";
	cin >> n >> S;
	for (int i = 0; i < S.length(); i++)
		S[i] = myString[(myString.find(S[i])+n)%26];
		
	cout << S << endl;
}
