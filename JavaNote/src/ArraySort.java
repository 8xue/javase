/*
数组相当于数据结构的一种实现，很多数据在进行存储的时候需要使用数组
   数据结构：
      线性表
      非线性表
      树
      图
      队列
      栈
数组排序：数组经常会用来考排序算法：
   面试需求：
      1.写出某种排序算法
          冒泡排序
          选择排序
          插入排序
          快速排序
      2.排序算法的时间复杂度（空间复杂度）
          衡量一个数据结构是否合适的衡量标准
      3.排序算法的稳定性
          排序之后的值跟排序之前的值位置是否发生变化
 */
public class ArraySort {
    public static void main(String[] args){
        //定义数组
        int[] arr1=new int[]{2,1,3,4,8,6,5,9,7};
        /*
        //冒泡排序，从小到大
        for (int i=0;i<arr1.length;i++){
            for (int j=0;j<((arr1.length)-1-i);j++){
                if (arr1[j]>arr1[j+1]){
                        int tmp=arr1[j];
                        arr1[j]=arr1[j+1];
                        arr1[j+1]=tmp;
                }
            }
        }

         */
        /*
        //选择排序
        for (int i=0;i< arr1.length;i++){
            for (int j=i+1;j< arr1.length;j++){
                if (arr1[i]>arr1[j]){
                    int tmp=arr1[j];
                    arr1[j]=arr1[i];
                    arr1[i]=tmp;
                }
            }
        }

         */
        //选择排序每一次排序的结果
        for (int i=0;i< arr1.length;i++){
            System.out.print("第"+i+"次选择排序的结果");
            for (int j=(i+1);j< arr1.length;j++){
                if (arr1[i]>arr1[j]){
                    int tmp=arr1[j];
                    arr1[j]=arr1[i];
                    arr1[i]=tmp;
                }
                }
            for (int a=0;a< arr1.length;a++){
                System.out.print(arr1[a]+"\t");
            }
            System.out.println();
        }

        /*开始以为可以，后面经过思考发现这其实就是冒泡排序的第一次结果，而且前面for循环判断那边没有写arr1.length-1，导致下面循环的i+1不存在数组中
        //嗯排序
        for (int i=0;i< arr1.length-1;i++){
            if (arr1[i]>arr1[i+1]){
                int tmp=arr1[i];
                arr1[i]=arr1[i+1];
                arr1[i+1]=tmp;
            }
        }
         */
        //打印结果
        for (int i=0;i< arr1.length;i++){
            System.out.print(arr1[i]+"\t");
        }



    }
}
