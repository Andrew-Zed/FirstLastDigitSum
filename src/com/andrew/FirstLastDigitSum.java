package com.andrew;

public class FirstLastDigitSum {


        public int sumFirstAndLastDigit(int number) {
            int lastDigit = 0;

            if (number >= 0){
                lastDigit = number % 10;

                while (number > 9){

                    number = number/10;

                }

                System.out.println(number + lastDigit);
                return (number + lastDigit);

            }
            System.out.println("Invalid");
            return -1;

        }


}
