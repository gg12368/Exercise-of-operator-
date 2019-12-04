写一个函数，返回参数二进制中1的个数
比如： 15 0000 1111 4 个 1
方法一：除二取余法
例如：

#include<stdio.h>
#include<window.h>
int  Count_One_Bits1(unsigned int value)
{
	int count = 0;
	while(value != 0)//7
	{
		if(value%2 == 1)
		{
			count++;
		}
		value= value/2;
	}
	return count;
}
int main()
{
	int num = 0;
	int ret = 0;
	printf("输入一个无符号整数：");
	scanf_s("%d", &num);
	ret = count_one_bits(num);
	printf("count=%d\n", ret);
	system("pause");
	return 0;
}
