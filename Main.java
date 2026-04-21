public class Main {
    public static void main(String[] args){
        Demo d=new Demo();
        System.out.println(d.findMax(7,9));
    }
}
interface Max{
    int findMax(int a,int b);

}
class Demo implements Max{
    public int findMax(int a,int b){
        return (a>b)?a:b;
    }
}