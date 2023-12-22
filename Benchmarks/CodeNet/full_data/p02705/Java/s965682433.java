import math
x = input()

# 円の周を計算する
def circle_round(radius):
  return 2 * math.pi * radius

if __name__ == '__main__':
  print(circle_round(int(x)))