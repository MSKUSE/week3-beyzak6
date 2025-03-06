public class FindMaximum {
    public static void main(String[] args) {

        int number1 = Integer.parseInt(args[0]);
        int number2 = Integer.parseInt(args[0]);
        boolean condition = number1 > number2;

        int greatest = condition ? number1 : number2;
        System.out.println(greatest);
    }
}
