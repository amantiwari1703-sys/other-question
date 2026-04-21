public class Main{
    public static void main(String[] args){
        Demo d=new Demo();
        System.out.println(d.area(5,3));
    }


}
interface Rectangle{
    int area(int l,int b);

}
class Demo implements Rectangle{
    public int area (int l,int b){
        return l*b;
    }
}


