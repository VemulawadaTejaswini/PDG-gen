#include <iostream>
#include <string>
#include <iomanip>
#include <random>
using namespace std;

int main() {
    int n = 0, k = 0;

    cin >> n;
    cin >> k;

    double sumN = 0.;

    for (int i = 1; i <= n ; ++i) {
        double diceP = 1.0 /n;

        int cnt = 1;
        for (int j = i; j < k ; j*=2) {
            cnt *= 2;
        }

        sumN += (diceP * (1.0/ cnt));
    }

    cout << sumN << endl;

    return 0;
}