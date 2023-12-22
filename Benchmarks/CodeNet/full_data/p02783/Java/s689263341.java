//  Twitter@KonoLv1 2020年春からエンジニア見習いデビュー！
 
//  標準入出力を扱うヘッダーファイルの読み込み
#include <stdio.h>
//  "atoi" "atof"などのキャスト、"rand" 疑似乱数を発生させるヘッダーファイルの読み込み
#include <stdlib.h>
//  "strcpy" "strcat"などの文字列操作や"strlen"文字列長さ取得などを行うヘッダーファイルの読み込み
#include <string.h>
//  "sqrtl" "fmax"などの数値操作を行うヘッダーファイルの読み込み
#include <math.h>
 
int main(void){
 
    int x,y,z;
    int i,j,k;
    int count = 0;
    int flg = 0;
    char s[200000] = {};
    int box[200000] = {};
 
    //scanf("%s %d",&s,&box[0]);
    scanf("%d %d",&x,&y);
    // HP x
    // DM y
    while(1){
        if (x <= 0){
            break;
        }
        count++;
        x = x - y;
    }
    
    //printf("%s \n%d",s,box[0]);
    printf("%d",count);
  
 
}