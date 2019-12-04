方法三：
按位与法：即x=x&(x-1)。
假设 5 0110
& 4 0100
结果： 0010
分析：当5的二进制位&比它小1即4的二进制位时，5的二进制位的个数就会少1。

#include<stdio.h>  
int count_one_bits(unsigned int value)
{
	int count = 0;
	while (value)
	{
		value = value & (value - 1);
		count++;
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
