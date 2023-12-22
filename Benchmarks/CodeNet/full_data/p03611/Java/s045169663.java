#include <iostream>
#include <stdlib.h>
using namespace std;

int main()
{
    int n;
    cin>>n;
    int array[n];
    for(int i=0;i<n;i++){
    cin>>array[i];
    }
    int ans = 0;
    for (int i = 0; i < n; i++) {
				int chosen = array[i];
				int result = 0;
				for (int j = 0; j < n; j++) {
					if (abs(array[j] - array[i]) == 1 || abs(array[j] - array[i]) == 0) {
						result++;
					}
				}
				ans = max(ans, result);
			}

    cout << ans << endl;
    return 0;
}
