#include <stdio.h>
#include<stdlib.h>
int main(int n)
{
  //Type your code here
  int num;
  scanf("%d",&num);
  printf("%d",addNumbers(num));
  return 0;
}
int addNumbers(int n)
{
  if(n!=0)
    return n+addNumbers(n-1);
  else
    return n;
}