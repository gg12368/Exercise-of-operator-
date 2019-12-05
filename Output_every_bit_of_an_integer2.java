输出一个整数的每一位。
方法二：迭代

#include <stdio.h>
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
