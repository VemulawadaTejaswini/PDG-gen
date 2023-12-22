
#include <iostream>
#include <string>

using namespace std;

int main()
{
	string b;
	cin >> b;

	if (b == "A") {
		cout << "T" << endl;
	}
	else if (b == "T") {
		cout << "A" << endl;
	}
	else if (b == "C") {
		cout << "G" << endl;
	}
	else if(b == "G"){
		cout << "C" << endl;
	}
}
