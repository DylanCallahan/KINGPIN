public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] yorick = {"big", "hulking", "massive", "yunki", "yur"};
        int temp = 0;
        for(int i = 0; i < yorick.length;i++) {
            System.out.println(yorick[i]);
            temp++;
            System.out.println(temp);
        }
    }
}