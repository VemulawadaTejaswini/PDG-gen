#include <iostream>
using namespace std;

int main(){
    int five = 0 , seven = 0 , n;
    
    for(int i = 0 ; i< 3 ; i++)
    {
        cin >> n;
        if(n == 5)
        {
            five++;
        }
        else if(n==7)
        {
            seven++;
        }
    }
    
    if(seven == 1 && five ==2)
    {
        cout << "YES\n";
    }
    else{
        cout << "NO\n";
    }
}