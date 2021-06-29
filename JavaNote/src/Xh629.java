import java.util.Scanner;

/*
循环结构
   1.while 先判断，在执行
      需要四部分组成
         初始化：变量的初始化
         条件判断：必须要求返回true或者false的值
         循环体：具体的要执行的逻辑代码
         迭代变量：促使此循环结束
   2.do while 先执行代码逻辑，在进行判断
   3.for循环，使用最多
       语法规则：
          for（初始化1；条件表达式2；步进器4）{
          代码逻辑3；
          }
       使用for循环的好处：
          1.代码简洁
          2.变量初始化的时候，for循环的作用域仅仅是当前for循环结构（只在for循环里面）
            while循环的作用域是从变量的定义到方法的结束
   4.break 跳出本层循环，当包含多层循环的时候，break只能跳出内层循环，无法跳出外层循环
   5.continue 跳出本次循环
   6.return有两个基本用途
       1.返回方法的返回值
       2.终止当前方法
   7.多重循环
 */
public class Xh629 {
    public static void main(String[] args){
       /*while循环例子
       int i=1;
        while (i<100){
            System.out.println("第"+i+"次输出");
            i++;
        }

        */
        /*求100以内的偶数和
        int i=1;
        int sum=0;
        while (i<=100){
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);

         */
        /*do while例子
        int i=1;
        do{
            System.out.println("第"+i+"次输出");
            i++;
        }while (i<=100);

         */
        /*for循环例子
        for (int i=1;i<=100;i++){
            System.out.println("第"+i+"次输出");
        }

         */
        /*10名顾客年龄超过30与不超过30的比率
        //定义Scanner对象
        Scanner sc=new Scanner(System.in);
        //存储超过30岁的人数
        int ageUp=0;
        //存储不超过30岁的人数
        int ageDown=0;
        for (int i=1;i<=10;i++){
            System.out.println("请输入第"+i+"位顾客的年龄");
            int age=sc.nextInt();
            if (age>30){
                ageUp++;
            }else {
                ageDown++;
            }
        }
        System.out.println("超过30岁的顾客的比率"+(ageUp/10.0*100)+"%");
        System.out.println("超过30岁的顾客的比率"+(ageDown/10.0*100)+"%");

         */
        /*生成0-100的随机数，直到生成88为止，停止循环
        for (int count=0;true;count++){
            int i=(int) (Math.random()*101);
            if (i==88){
                break;
            }
            System.out.println("第"+(count+1)+"次是"+i);
        }


         */
        /*cotinue例子，输出100-150之间不能被3整除的数
        for (int i=100;i<151;i++){
            if (i%3==0){
                continue;
            }
            System.out.println(i);
        }

         */
        /*输出九九乘法表
        for (int i=1;i<10;i++){
            for (int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"\t ");
            }
            System.out.println();
        }

         */
        /*输出1-1000以内能被5整除的数字，而且每行输出三个数字
         int count=0;
         for (int i=1;i<=1000;i++){
             if (i%5==0){
                 System.out.print(i+"\t");
                 count++;
             }
             if (count>=3){
                 System.out.println();
                 count=0;
             }
         }

         */
        //把十进制数转为二进制数
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个十进制数：");
        int number=sc.nextInt();
        String str="";
        while (number!=0){
            int i=number%2;
            str=i+str;
            number=number/2;

        }
        System.out.println(str);

    }
}
