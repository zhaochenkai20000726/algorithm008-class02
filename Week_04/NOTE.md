学习笔记
DFS和BFS
深度优先遍历DFS：利用了深度优先搜索算法可以产生目标图的相应拓扑排序表，采用拓扑排序表可以解决很多相关的图论问题，如最大路径问题等等。利用Java集合类的栈Stack先进后出的特点来实现。

深度优先搜索的步骤为（使用二叉树实现）：
这里是二叉树图片

（1）首先节点 1 进栈，节点1在栈顶；

（2）然后节点1出栈，访问节点1，节点1的孩子节点3进栈，节点2进栈；

（3）节点2在栈顶，然后节点2出栈，访问节点2

（4）节点2的孩子节点5进栈，节点4进栈

（5）节点4在栈顶，节点4出栈，访问节点4，

（6）节点4左右孩子为空，然后节点5在栈顶，节点5出栈，访问节点5；

（7）节点5左右孩子为空，然后节点3在站顶，节点3出栈，访问节点3；

（8）节点3的孩子节点7进栈，节点6进栈

（9）节点6在栈顶，节点6出栈，访问节点6；

（10）节点6的孩子为空，这个时候节点7在栈顶，节点7出栈，访问节点7

（11）节点7的左右孩子为空，此时栈为空，遍历结束。

广度优先步骤（利用Java数据结构队列Queue来实现）：
（1）节点1进队，节点1出队，访问节点1

（2）节点1的孩子节点2进队，节点3进队。

（3）节点2出队，访问节点2，节点2的孩子节点4进队，节点5进队；

（4）节点3出队，访问节点3，节点3的孩子节点6进队，节点7进队；

（5）节点4出队，访问节点4，节点4没有孩子节点。

（6）节点5出队，访问节点5，节点5没有孩子节点。

（7）节点6出队，访问节点6，节点6没有孩子节点。

（8）节点7出队，访问节点7，节点7没有孩子节点，结束。

贪心算法
贪心只选择当前最有利的，不考虑这步选择对以后的选择造成的影响

贪心策略适用的前提是：局部最优策略能导致产生全局最优解。 实际上，贪心算法适用的情况很少。一般对一个问题分析是否适用于贪心算法，可以先选择该问题下的几个实际数据进行分析，就可以做出判断。

贪心算法的实现框架

从问题的某一初始解出发：

while (朝给定总目标前进一步) { 利用可行的决策，求出可行解的一个解元素。 } 由所有解元素组合成问题的一个可行解