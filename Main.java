public class Main {
    public static void main(String[] args) {
        Demo d = new Demo();
        System.out.println(d.len("hello"));
    }
}
interface length {
   public int len(String str);

    }

class Demo implements length{
    public int len(String str){
        return str.length();
    }
}
