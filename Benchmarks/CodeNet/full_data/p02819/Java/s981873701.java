def is_prime(num):
  i = 5
  while (i * i <= num):
      if num % i == 0 or num % (i+2) ==0:
          return False
      i+=6
  return True if num > 1 and num <=3 else False if num % 2 == 0 or num % 3 == 0 or num <=1 else True

k = int(input())
if is_prime(k):
  print(k)
else:
  while(not is_prime(k)):
    k +=1
  print(k)