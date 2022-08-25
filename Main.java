public class Main {
    int a;
    int b;
    String s;

    public static void main(String[] args){
        printMessage("sum a and b");
        printSum(1,4);
    }
    public static void printMessage(String s){
        System.out.println(s);
    }
    public static void printSum(int a, int b){
        a=a+b;
        System.out.println(a);
    }
}
