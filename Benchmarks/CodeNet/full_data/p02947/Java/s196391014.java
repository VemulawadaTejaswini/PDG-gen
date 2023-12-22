alphas = [chr(i).lower() for i in range(65, 65+26)]

n = int(input())

same_count = 0
sorted_list = []
for index in range(n):
  s = input()
  sorted_s = ''.join(sorted(s))
  same_count += sorted_list.count(sorted_s)

  sorted_list.append(sorted_s)
print(same_count)