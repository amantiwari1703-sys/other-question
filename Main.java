public class Main {
    public static void main(String[] args) {
        Demo d=new Demo();
        d.msg();

    }
}
interface message{
    void msg();

}
class Demo implements message{
    public void msg(){
        System.out.println("welcome to java ");
    }
}
