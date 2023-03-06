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

        
    }
}