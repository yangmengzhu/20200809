import java.util.Scanner;

public class Demo1 {
    public static void main1(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int i = 1; i <=n; i++) {
            int j=0;
            for (j = 2; j <=(int)Math.sqrt(i); j++) {
                if(i%j==0){
                    break;
                }
            }
            if(j>(int)Math.sqrt(i)){
                System.out.println(i+"是素数");
            }
        }
    }

    public static void main2(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        for (int year = 1000; year <=n; year++) {
            if((year%4==0&&year%100!=0)||year%400==0){
                System.out.println(year);
            }
        }
    }

    public static void main3(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(i+"*"+j+"="+i*j+" ");
            }
            System.out.println();
        }
    }

    public static void main4(String[] args) {
        Scanner scan=new Scanner(System.in);
        int m=scan.nextInt();
        int n=scan.nextInt();
        int tmp=n;
        while(m%n!=0){
            tmp=m%n;
            m=n;
            n=tmp;
        }
        System.out.println(tmp);
    }

    public static void main5(String[] args) {
        int flag=1;
        double sum=0;
        for (int i = 1; i <=100 ; i++) {
            sum+=1.0*flag/i;
            flag=-flag;
        }
        System.out.println(sum);
    }

    public static void main6(String[] args) {
        int count=0;
        for (int i = 1; i <=100; i++) {
            if(i%10==9){
                count++;
            }
            if(i/10==9){
                count++;
            }
        }
        System.out.println(count);
    }

    public static void main7(String[] args) {
        for (int i = 0; i <=999999; i++) {
            int tmp=i;
            int count=0;
            while(tmp!=0){
              count++;
              tmp=tmp/10;
            }
            tmp=i;
            int sum=0;
            while(tmp!=0){
               sum+=(int)Math.pow(tmp%10,count);
                tmp=tmp/10;
            }
            if(sum==i){
                System.out.print(sum+" ");
            }
        }
    }

    public static void main8(String[] args) {
        Scanner scan=new Scanner(System.in);
       int count=3;
        while(count!=0){
            System.out.println("请输入你的密码");
            String password=scan.nextLine();
            if(password.equals("123456") ){
                System.out.println("登录成功");
                break;
            }else{
                count--;
                System.out.println("你还有"+count+"次机会");
            }
        }
    }

    public static void main(String[] args) {














































































    }

}
