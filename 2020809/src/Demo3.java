public class Demo3 {
    public static void move(char pos1,char pos2){
        System.out.print(pos1+"->"+pos2+" ");
    }
    public static void hannuo(int n,char pos1,char pos2,char pos3){
        //终止条件
        if(n==1){
            move(pos1,pos3);
        }else{
            hannuo(n-1,pos1,pos3,pos2);
            move(pos1,pos3);
            hannuo(n-1,pos2,pos1,pos3);
        }
    }
    public static void main(String[] args) {
       // hannuo(4,'A','B','C');

        System.out.println( frog(5));
    }
    public static int frog(int n){
        if(n==1){
            return 1;
        }else if(n==2){
            return 2;
        }else{
            return frog(n-1)+frog(n-2);
        }
    }
}
