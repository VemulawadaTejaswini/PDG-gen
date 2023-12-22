#include<stdio.h>
#include<stdlib.h>
#include<math.h>
#include<string.h>
int main(void){
    char string[100001];
    scanf("%s",string);
    long i=0,j=0,k;
    long count=0;
    int flag=-1;
    while(flag!=count){
        //printf("(%d,%d)\n",flag,count);
        i=0;
        flag=count;
        while(string[i+1]!='\0'){
            if(string[i+1]!='2'){
                if(string[i]=='0'&&string[i+1]=='1'){
                    count+=2;
                    string[i]='2';
                    string[i+1]='2';
                    i++;
                }
                else if(string[i+1]=='0'&&string[i]=='1'){
                    count+=2;
                    string[i]='2';
                    string[i+1]='2';
                    i++;
                }
                i++;
            }
            else if(string[i+1]=='2'){
                k=i;
                j=0;
                while(string[k+1]=='2'){
                    j++;
                    k++;
                }
                if(string[i]=='0'&&string[i+1+j]=='1'){
                    count+=2;
                    string[i]='2';
                    string[i+1+j]='2';
                }
                else if(string[i+1+j]=='0'&&string[i]=='1'){
                    count+=2;
                    string[i]='2';
                    string[i+1+j]='2';
                }
                i++;
            }
        }
    }
    printf("%ld",count);
    return 0;
}