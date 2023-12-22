#include <iostream>
#include <string>
using namespace std;

int main() {
	double a, b, c;
	cin >> a >> b >> c;
	
	double result = 0;
	
	long max = a;

	if (max < b) {
		max = b;
	}

	if (max < c) {
		max = c;
	}

	if (max % 2 == 0) {
		cout << 0;
	}
	else {
		//cout << max << "\n";
		result = (a*b*c / max);
		cout << (int)result;
	}
	

	

}