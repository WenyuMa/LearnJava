import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int num=in.nextInt();
        int max=num;
        for (int i = 1; i <=num ; i++) {
            if (gettimes(num,i)>max){
                max=gettimes(num,i);
            }
        }
        System.out.println(max);

    }
    public static int gettimes(int num,int part){
        int avg=num/part;
        int[] data=new int[part];
        for (int i = 0; i <part-1 ; i++) {
            data[i]=avg;
        }
        data[part-1]=num-avg*(part-1);
        int result=1;
        for (int i = 0; i <part ; i++) {
            result*=data[i];
        }
        return result;
    }
}