方法二：
移位法;移位法分为左移和右移两种情况。左移规则：左边抛弃，右边补0。右移规则：右边抛弃，左边补0。

#include<stdio.h>
#include<window.h>
int  Count_One_Bits2(unsigned int value)
{
	int count = 0;
	while(value != 0)//1111111111111111111111111111
	{
		if(((value)&1) == 1)
		{
			count++;
		}
		value = value>>1;
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
