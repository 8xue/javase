import java.util.Scanner;

public class xhwork {
    public static void main(String[] args) {
        /*用for循环打印斐波那契数列
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要打印的斐波那契数列的数字个数：");
        int number = sc.nextInt();
        int x = 1;
        int y = 1;
        int z = 0;
        for (int i = 1; i <= number; i++) {
            if (i== 1 || i == 2) {
                System.out.print(1 + "\t");
            } else {
                z = x + y;
                y = x;
                x = z;
                System.out.print(z + "\t");
            }
        }

         */
        //百钱买百鸡：用100块钱买100只鸡，其中公鸡5块钱一只，母鸡3块钱一只，小鸡1块钱3只
        for (int a=0;a<=20;a++){
            for (int b=0;b<=33;b++){
                for (int c=0;c<=300;c++){
                    if ((a+b+c==100)&&(5*a+3*b+c/3==100)&&(c%3==0)){
                        System.out.println("公鸡："+a+"\t"+"母鸡："+b+"\t"+"小鸡："+c);
                    }
                }
            }
        }
    }
}
