// This file is a "Hello, world!" in C++ language by GCC for wandbox.
#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    int a,b,max;
    cin >> a >> b;
    
    if(a+b>a*b && a+b>a-b)
        max=a+b;
    else if(a-b>a+b && a-b>a*b)
        max=a-b;
    else 
        max=a*b;
    
    cout << max << endl;
    return 0;
}