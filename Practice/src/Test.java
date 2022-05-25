public class Test {
    public static void main(String[] args) {
        String str[] = {"hel","weo","han","aja"};
        for(int i=0;i<str.length;i++)
        {
            String nameSpeed = str[i];
            String name = "姓名：";
            name += nameSpeed;
            System.out.println(name);
        }
    }
}
