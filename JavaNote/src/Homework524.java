import java.util.Scanner;

/*
简单的加减乘除计算器
 */
public class Homework524 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1=sc.nextInt();
        System.out.println("请输入操作符号：");
        char fh=sc.next().charAt(0);
        System.out.println("请输入第二个数字：");
        int num2= sc.nextInt();
        switch (fh){
            case '+':
                System.out.println(num1+num2);
                break;
            case '-':
                System.out.println(num1-num2);
                break;
            case '*':
                System.out.println(num1*num2);
                break;
            case '/':
                System.out.println(num1/num2);
                break;
        }

    }
}
