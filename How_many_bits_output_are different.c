编程实现：
两个int（32位）整数m和n的二进制表达中，
有多少个位(bit)不同？
输入例子:
1999 2299
输出例子:7

include <stdio.h>
#include <windows.h>
int main()
{
	int m = 0;
	int n = 0;
	int q = 0;
	int count = 0;
	printf("请输入两个数字：");
	scanf_s("%d%d", &m, &n);
	q = m ^ n;  // 两个数按位异或，对应不同的位将会置1
	while (q)
	{
		q = q & (q - 1);  //按位与方法计算一个整数中比特位为1的个数
		count++;
	}
	printf("count=%d", count);
	system("pause");
	return 0;
}
