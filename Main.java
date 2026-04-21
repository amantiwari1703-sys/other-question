public class Main {
    public static void main(String[] args) {
Demo d=new Demo();
        System.out.println(d.pow(2,3));
    }
}
interface Power{
    int pow(int a,int b);
}
class Demo implements Power{
    public int pow(int a,int b){
        int result =1;
        for(int i=0;i<b;i++){
            result*=a;
        }
        return result;
    }
}
