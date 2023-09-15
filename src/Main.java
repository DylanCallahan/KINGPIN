public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        String[] yorick = {"big", "hulking", "massive", "yunki", "yur"};
        int temp = 0;
        for (String s : yorick) {

            temp++;
            System.out.println(s+" spot in array: "+temp);
        }
    }
}