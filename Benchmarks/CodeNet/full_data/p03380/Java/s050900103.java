#include <iostream>
#include <cstdio>
#include <cstdlib>
#include <cstring>
#include <cmath>
#include <map>
#include <vector>
#include <queue>
#include <algorithm>
using namespace std;

long long comb(long long n, long long r) {
    if ( r == 0 || n == r) {
        return 1;
    } else {
        return comb(n-1, r) + comb(n-1,r-1);
    }
}

int main(){
    int size;
    long long input[100000];
    scanf("%d", &size);
    for(int i=0;i<size;i++){
        scanf("%lld", &input[i]);
    }

    long long maxComb = -1;
    long long maxAi = 0;
    long long maxAj = 0;
    for (int i = 0; i < size; ++i) {
        for (int j = 0; j < size; ++j) {
            if (i == j) continue;
            long long ai = input[i];
            long long aj = input[j];
            if (ai > aj) {
                long long c = comb(ai, aj);
                if (maxComb < c) {
                    maxComb = c;
                    maxAi = ai;
                    maxAj = aj;
                }
            }
        }
    }
    printf("%lld %lld\n", maxAi, maxAj);
    return 0;
}