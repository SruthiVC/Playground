#include<stdio.h>
int main()
{
  int l,b,peri,area;
  l=6;
  b=9;
  peri=2*(l+b);
  area=l*b;
  printf("The perimeter of the rectangle is: %d cm\nThe area of the rectangle is: %d sq cm",peri,area);
  return 0;
}