#include <iostream>

using namespace std;

int main(){
    char name[4];
    cin >> name;
    int count1 = 0;
    int count2 = 0;

    if (name[0] == name[1]){
        count1 = 2;
        if (name[2] == name[3]){
            count2 = 2;
        }
    }
    else{
        if (name[0] == name[2]){
            count1 = 2;
            if (name[1] == name[3]){
                count2 = 2;
            }
        }
        else{
            if (name[0] == name[3]){
                count1 = 2;
                if (name[1] == name[2]){
                    count2 = 2;
                }
            }
        }
    }

    if ((count1 == 2) && (count2 == 2)){
        cout << "Yes" << "\n";
    }
    else{
        cout << "No" << "\n";
    }
    return 0;
}

