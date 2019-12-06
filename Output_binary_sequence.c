获取一个数二进制序列中所有的偶数位和奇数位，
分别输出二进制序列。

#include <stdio.h>  
int main()
{
	int num = 0, i = 0;
	scanf_s("%d", &num);
	printf("奇数序列为：");
	for (i = 31; i >= 0; i -= 2)  //也是控制32次（每个整型数按32位来算），只是从31位开始移动  
	{
		printf("%d ", (num >> i) & 1);  //第一次向右移动31位和1与得到第一位情况，每次变化2位，即可得到奇数位情况  
	}
	printf("\n");
	printf("偶数序列为：");
	for (i = 30; i >= 0; i -= 2)  //向右移动30位，再与1所得结果是原来数字的第二位，再移28位...  
	{
		printf("%d ", (num >> i) & 1);  //  
	}
	printf("\n");
	system("pause");
	return 0;
}
