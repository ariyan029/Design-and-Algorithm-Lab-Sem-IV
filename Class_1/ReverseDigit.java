public class ReverseDigit {
    public static int reverseDigits(int num) {
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    public static void main(String[] args) {
        int number = 12345;
        int reversedNumber = reverseDigits(number);
        System.out.println("Original Number: " + number);
        System.out.println("Reversed Number: " + reversedNumber);
    }
}
/*
Original Number: 12345
Reversed Number: 54321
*/