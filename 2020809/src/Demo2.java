public class Demo2 {
    public static void func(int n){
        if(n>9){
            func(n/10);
        }
        System.out.println(n%10);
    }
    public static int sum(int n){
        if(n==1){
            return 1;
        }
        return n+sum(n-1);
    }
    public static int func1(int n){
        if(n>9){
            return n%10+func1(n/10);
        }
        return n;
    }
    public static int fib(int n){
        if(n==1||n==2){
            return 1;
        }
        return fib(n-1)+fib(n-2);
    }
    public static int func2(int n){//形参是实参的一份临时拷贝
        int f1=1;
        int f2=1;
        int f3=1;//如果n==1或者0时会有问题
        for (int i = 3; i <n ; i++) {
            f3=f1+f2;
            f1=f2;
            f2=f3;
        }
        return f3;
    }
    public static void main(String[] args) {
        System.out.println(func2(10));
    }
}
