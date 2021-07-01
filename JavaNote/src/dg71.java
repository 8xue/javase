/*
递归函数：
   在程序运行过程中，有时需要调用程序本身，此时可以使用递归
   注意：
      在程序中，能不使用递归就不要使用递归
         使用递归的时候会加大资源的消耗
         如果递归的层次比较深，会造成栈溢出
      如果不使用递归无法解决问题的话，就必须使用递归
         比如：输出某个磁盘目录下所有文件名称
 */
public class dg71 {
    public static void main(String[] args){
        //1: 用递归实现打印斐波那契数列前十个数
        for (int i=1;i<=10;i++){
            System.out.print(getNumber(i)+"\t");
        }



    }
    //1： 用递归实现打印斐波那契数列前十个数
    public static int getNumber(int number){
        if (number==1||number==2){
            return 1;
        }else {
            return getNumber(number-1)+getNumber(number-2);
        }
    }


}
