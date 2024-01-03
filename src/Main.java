public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(11212));
        System.out.println(isPalindrome(7070));
        System.out.println("***********************");
        System.out.println(isPalindrome2(-1221));
        System.out.println(isPalindrome2(121));
        System.out.println(isPalindrome2(11212));
        System.out.println(isPalindrome2(7070));
        System.out.println("***********************");
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(-1));
        System.out.println("***********************");
        System.out.println(numberToWords(123));
        System.out.println(numberToWords(1010));
        System.out.println(numberToWords(5896));
        System.out.println(numberToWords(-12));
        System.out.println("***********************");
        System.out.println(getEvenDigitSum(123456));
        System.out.println("***********************");
        System.out.println(getFirstAndLastDigitSum(123456));
        System.out.println("***********************");



    }
    public static boolean isPalindrome(int num) {

        num = Math.abs(num);
        char[] digits = String.valueOf(num).toCharArray();
        String reversed = "";
        for (int i = digits.length - 1; i >= 0; i--) {
            reversed += digits[i];
        }
        return reversed.equals(String.valueOf(num));
    }
    public static boolean isPalindrome2(int num) {
        num = Math.abs(num);
        int originalNum = num;
        int reversedNumber = 0;

        while (num > 0) {
            int digit = num % 10;
            reversedNumber = reversedNumber * 10 + digit;
            num = num / 10;
        }
        return originalNum == reversedNumber;
    }
    public static boolean isPerfectNumber(int num){
        if(num <= 0){
            return false;
        }
        int total = 0;
        for (int i = 1; i <= num/2; i++){
            if(num % i == 0){
                total += i;
            }
        }
        return num == total;
    }

    public static String numberToWords(int num){
        if(num < 0){
            return "Invalid Value";
        }
        char[] digits = String.valueOf(num).toCharArray();
        String numToText = "";
        for(char digit:digits){
            switch (digit){
                case '0':
                    numToText += "Zero ";
                    break;
                case '1':
                    numToText += "One ";
                    break;
                case '2':
                    numToText += "Two ";
                    break;
                case '3':
                    numToText += "Three ";
                    break;
                case '4':
                    numToText += "Four ";
                    break;
                case '5':
                    numToText += "Five ";
                    break;
                case '6':
                    numToText += "Six ";
                    break;
                case '7':
                    numToText += "Seven ";
                    break;
                case '8':
                    numToText += "Eight ";
                    break;
                case '9':
                    numToText += "Nine ";
                    break;
            }
        }
        return numToText.trim();
    }

    public static int getEvenDigitSum(int num){
        num = Math.abs(num);
        int sum = 0;
        char[] digits = String.valueOf(num).toCharArray();
        for(char digit:digits){
            int parseDigit = Integer.parseInt(String.valueOf(digit));
            if(parseDigit % 2 == 0){
                sum += parseDigit;
            }
        }
        return sum;
    }
    public static int getFirstAndLastDigitSum(int num){
        int lastDigit = num % 10;
        char firstDigitChar = String.valueOf(num).charAt(0);
        int firstDigit = Integer.parseInt(String.valueOf(firstDigitChar));
        return firstDigit + lastDigit;
    }

    public static boolean hasSameLastDigit(int... nums){
        int[] lastDigits = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            lastDigits[i] = nums[i] % 10;
        }

        for(int i = 0; i < lastDigits.length; i++){
            for(int j = i+1; j < lastDigits.length; j++){
                if(lastDigits[i] == lastDigits[j]){
                    return true;
                }
            }
        }
        return false;
    }
}