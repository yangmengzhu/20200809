import java.util.Random;
import java.util.Scanner;

public class TestDemo {
    public static void main1(String[] args) {
        /*double a=1.1;
        System.out.println(a*a);1.000000000002
        System.out.println(a/a);//1.0*/
        /*double a=1;
        double b=2;
        System.out.println(a*b);2.0
        System.out.println(a/b);0.5*/
        /*int a=1;
        int b=2;
        System.out.println(a/b);//0*/
        /*char ch='a';
        char ch1='高';
        System.out.println(ch1);*/
        /*byte a=12;
        byte b=21;
        System.out.println(Byte.MAX_VALUE );*/
       /* byte a=Byte.MIN_VALUE+1;
        System.out.println(a);-127*/
       /* byte a=Byte.MAX_VALUE-1;
        System.out.println(a);//126*/
        /*int a=10;
        String str=a+"";
        String str1=String.valueOf(a); */
        String str="10";
        int a=Integer.parseInt(str);
    }

    public static void main2(String[] args) {
        System.out.println(5/2);//2
        System.out.println(5.0/2);//2.5
        System.out.println(5/2.0);//2.5
        System.out.println(5.0/2.0);//2.5
        System.out.println((float)5/2);//2.5
        System.out.println((float)(5/2));//2.0
    }

    public static void main3(String[] args) {
        System.out.println(10%3);//1
        System.out.println(-10%3);//-1
        System.out.println(10%-3);//1
        System.out.println(-10%-3);//-1
        System.out.println(11.5%2.0);
    }
   //阶乘之和
    public static void main4(String[] args) {
        int ret=1;
        int sum=0;
        for (int i = 1; i <=5; i++) {
            ret*=i;
            sum+=ret;
        }
        System.out.println(sum);
    }
    //猜数字游戏
    public static void main5(String[] args) {
        Scanner scan=new Scanner(System.in);
        Random random=new Random();
        int ranNum=random.nextInt(100)+100;//[100,200)
        System.out.println(ranNum);
        while(true){
            int num=scan.nextInt();
           if(num < ranNum){
               System.out.println("小了");
           }else if(num > ranNum){
               System.out.println("猜大了");
           }else{
               System.out.println("猜对了");
               break;
           }
        }
    }
  //判断是否是素数
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i = 2; i < n; i++) {
            if(n%i==0){
                System.out.println("不是素数");
            }
        }
        for (int i = 0; i <=Math.sqrt(n); i++) {
            if(n%i==0){
                System.out.println("不是素数");
            }
        }
        for (int i = 0; i <=n/2 ; i++) {
            if(n%i==0){
                System.out.println("不是素数");
            }
        }
    }
}
