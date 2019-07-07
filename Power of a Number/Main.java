#include <stdio.h>
#include<math.h>
int main()
{
  	int a,b;
  scanf("%d%d",&a,&b);
  if(b>=0)
  {
    printf("%.0lf",pow(a,b));
  }
  else 
  {
    printf("Wrong input");
  }
    return 0;
}