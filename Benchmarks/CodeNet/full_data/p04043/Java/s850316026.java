read a b c
five=0
seven=0
for i in $a $b $c
do
  if [ $i -eq 5 ]; then
    five=`expr $five + 1`
  fi
  if [ $i -eq 7 ]; then
    seven=`expr $seven + 1`
  fi
done
if [ $five -eq 2 ]; then
  if [ $seven -eq 1 ]; then
    echo "YES"
  else
    echo "NO"
  fi
else
  echo "NO"
fi