public class Main {
    public static void main(String[] args) {

        for (int i = 1 ; i <=15 ; i++) {
            System.out.println(i);
        }

        int number = 5;
        int exponent = 1;
        int max = 10000;
        while (Math.pow(number,exponent) <= max){
            System.out.println(Math.pow(number,exponent));
            exponent++;
        }

        for (int i = 5; i <= 10000; i = i * 5) {
            System.out.println(i);
        }

        for (int i = 40; i <= 60; i = i + 4) {
            System.out.println(i);
        }
    }
}