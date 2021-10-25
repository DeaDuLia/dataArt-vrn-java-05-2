package ru.dataart.academy.java;

public class ReverseInteger {
    /**
     * @param inputNumber - any integer value
     * @return - inputNumber in reversed order
     * Example: 1234 -> 4321
     * -23 -> -32
     * 120 -> 21
     * -2,147,483,648 -> exception and error message
     * If result (number in reversed order) is out of int range [-2,147,483,648,  2,147,483,647] throw custom
     * unchecked exception. In main method (Main class) if exception happened output message with problem to user.
     */

    public int reverse(int inputNumber) {

        long res = 0;
        int sz = String.valueOf(Math.abs(inputNumber)).length();
        for (int i = 1; i < sz; i++) {
            int tmp = inputNumber % 10;
            res += tmp * Math.pow(10, sz-i);
            inputNumber/=10;
        }
        res+= inputNumber;
        if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) throw new RuntimeException("Введено число, которое не может быть конвертировано.");
        return (int)res;
    }
}
