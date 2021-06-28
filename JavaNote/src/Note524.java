import java.util.Scanner;

/*5.24的相关笔记
        原码第一位表示符号位,0为+,1为-
        反码正数和原码一样,负数的话保留符号位1,其他的按位取反
        补码正数和原码一样,负数的是反码+1


        基本数据类型之间的转换：
        1.自动转换（隐形转换）
        2.强制转换
        注意：
           1：在进行算术运算操作的时候，必须要求数据类型一致，否则无法操作
           2：在运算过程中，如果两个值的类型不一致，会自动把小的类型转换为大的类型
           3：在运算过程中，可以手动强制转换，把大的类型转换为小的类型
                  实现方式，（datatype）
           4：强制转换，会发生精度损失，结果可能不准确

        流程控制语句：
        1：顺序
        2：分支结构(选择结构）
           1：单分支结构
                 只做单一条件的判断，如果符合，做某些事情
           2：双分支结构
                 当做条件判断的时候，只有两种选择
           3：多分支结构
                 可以进行多个条件的判断，每个匹配项可以选择不同的执行结果
           4：嵌套分支结构
                 在分支结构中嵌套分支结构
           5：switch多分支结构
                 一般用作等值判断
        3：循环结构
        4：跳转
        5：多重循环
        6：方法
        7：递归算法


*/
public class Note524 {
    public static void main(String[] args){

        //System.out.println(~4);
        //单分支判断，Math,random()产生数据的范围是【0，1）
        //得到0-5之间的随机数
        /*int i=(int)(Math.random()*6);
        if(i>3){
            System.out.println("值大于3");
        }
        System.out.println("number:"+i);
    */
        //双分支
        /*
        int r=3;
        double PI=3.14;
        double area=PI*r*r;
        double length=2*PI*r;
        if(area>=length){
            System.out.println("半径为"+r+"的圆的的面积大于等于周长");
        }else {
            System.out.println("半径为"+r+"的圆的的面积小于周长");
        }

         */
        //Scanner
        //创建文件扫描器对象，System.in表示标准输入，可以从控制台读取数据（装饰者模式）
        /*Scanner sc=new Scanner(System.in);
        System.out.println("请输入");
        String str= sc.nextLine();
        System.out.println("str的数据是"+str);

         */
        //多分枝结构
        /*int age=(int)(Math.random()*100);
        if(age<10){
            System.out.println("少年");
        }else if (age<30){
            System.out.println("青年");
        }else if (age<60){
            System.out.println("中年");
        }else {
            System.out.println("老年");
        }

         */
        //嵌套分支结构
        /*int time=(int)(Math.random()*40);
        if (time<20){
            System.out.println("欢迎进入决赛！");
            String sex=((int)(Math.random()*2))==0?"girl":"boy";
            if (sex=="girl"){
                System.out.println("欢迎进入女子组决赛");
            }else {
                System.out.println("欢迎进入男子组决赛");
            }
        }else {
            System.out.println("成绩太差，被淘汰");
        }

         */
        //switch多分支结构
        /*注意：
            1. 每个case模块要添加break，防止多次匹配；
            2. 如果多个case处理的逻辑代码块的功能一致，可以考虑只在最后添加一次处理
            3. default表示表示默认选项，当所有的case不匹配的时候，就会执行这个选项
            4. default可以有，也可以没有
         */
        int random=(int)(Math.random()*26);
        char ch=(char)('a'+random);
        switch (ch){
           /* case 'a':
                System.out.println("元音："+ch);
                break;
            case 'e':
                System.out.println("元音："+ch);
                break;
            case 'i':
                System.out.println("元音："+ch);
                break;
            case 'o':
                System.out.println("元音："+ch);
                break;
            case 'u':
                System.out.println("元音："+ch);
                break;
            case 'y':
                System.out.println("半元音："+ch);
                break;
            case 'w':
                System.out.println("半元音："+ch);
                break;
            default:
                System.out.println("辅音："+ch);

            */
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("元音："+ch);
                break;
            case 'y':
            case 'w':
                System.out.println("半元音："+ch);
                break;
            default:
                System.out.println("辅音："+ch);
        }

    }
}
