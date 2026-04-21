import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println("Enter the number");
        int num=d.getNum();
        System.out.println(num);
    }
}
interface input{
    int getNum();
}
class Demo implements input{
    public int getNum(){
        Scanner sc=new Scanner(System.in);
        return sc.nextInt();
    }
}