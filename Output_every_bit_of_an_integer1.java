输出一个整数的每一位。
方法一：递归

#include<stdio.h>
void play(int x)
{
	if (x != 0)
	{
		printf("%d", x % 10);
		play(x / 10);
	}
}
int main()
{
	int k=0;
	scanf_s("%d", &k);
	play(k);
	system("pause");
	return 0;
}
