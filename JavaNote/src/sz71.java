import java.util.Scanner;

/*
数组：
   特点：1.长度固定的,且大小不可以改变（避免数组越界）
        2.数组元素都必须是相同类型，不能属实混合类型。
        3.数组元素可以是任何类型，包括基本类型和引用类型。
        4.可以通过下标的值来获取数据，下标从0开始
        5.插入数组中的数据是有序集合，此时有序并不指大小顺序，是指插入的顺序
   使用：1.声明数组
        2.创建空间
        3.赋值
        4.数组操作

 */
public class sz71 {
    public static void main(String[] args){
        //声明数组
        int[] array;
        //创建内存空间
        array=new int[5];
        //数组赋值
        array[0]=0;
        array[1]=1;
        array[2]=2;
        array[3]=3;
        array[4]=4;
        //数组操作
        System.out.println((array[2]+array[3]));
        //数组的几种创建方式
        //1.声明并申请空间
        int[] arr1=new int[5];
        //2.声明数组并赋值
        int[] arr2=new int[]{1,2,3,4,5};
        //3.直接初始化操纵
        int[] arr3={1,2,3,4,5};
        //获取数组长度
        System.out.println(arr1.length);
        //求平均数
        int[] arr4={1,2,3,4,5};
        int sum=0;
        for (int i=0;i<arr4.length;i++){
            sum=sum+arr4[i];
        }
        System.out.println("平均数是："+(sum/arr4.length));
        /*输入五个数字求平均数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入数字：");
        int num1=sc.nextInt();
        System.out.println("请输入数字：");
        int num2=sc.nextInt();
        System.out.println("请输入数字：");
        int num3=sc.nextInt();
        System.out.println("请输入数字：");
        int num4=sc.nextInt();
        System.out.println("请输入数字：");
        int num5=sc.nextInt();
        int sum1=0;
        int[] num=new int[]{num1,num2,num3,num4,num5};
        for (int i=0;i<num.length;i++){
            sum1=sum1+num[i];
        }
        System.out.println("平均数是："+(sum1/num.length));

         */
        //已知数字个数求平均数
        Scanner sc=new Scanner(System.in);
        int stn=5;
        int sum1=0;
        for (int i=0;i<stn;i++){
            int[] num=new int[5];
            System.out.println("请输入数字:");
            num[i]=sc.nextInt();
            sum1=sum1+num[i];
        }
        System.out.println("平均数是："+(sum1/stn));



        /*数组是引用类型，当创建完成数组后相当于在方法外定义了一个变量，此时数组中的值是有默认值的，默认值取决于你定义的数组的类型
             int:0;
             String:null;
             boolean:false;
             数组可以根据下标来获取值，下标的范围是【0-length-1】‘

         */

    }
}
