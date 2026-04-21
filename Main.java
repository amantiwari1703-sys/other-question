public class Main {
    public static void main(String[] args) {
        Demo d=new Demo();
        System.out.println(d.getCube(3));

    }
}
interface Cube{
    int getCube(int n);
}
class Demo implements Cube{
    public int getCube(int n){
        return n*n*n;
    }
}