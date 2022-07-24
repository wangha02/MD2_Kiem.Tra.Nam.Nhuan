package MD2;

import java.util.Scanner;

public class MD2_Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year;
        System.out.println("Enter a year");
        year = scanner.nextInt();
        //CÁCH 1:
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.printf("%d is a leap year", year); //Printf: nhận trực tiếp tham số chuyền từ ngoài in trong chuỗi thông qua %d
//                } else {
//                    System.out.printf("%d is NOT a leap year", year);
//                }
//            } else {
//                System.out.printf("%d is a leap year", year);
//            }
//        } else {
//            System.out.printf("%d is NOT a leap year", year);
//        }
//    }
//}
        //CÁCH 2:
        boolean isLeapYear = false;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    isLeapYear = true;
                }
            }else {
                isLeapYear = true;
            }
        }

        if (isLeapYear){
            System.out.printf("%d is a leap year", year);
        }else {
            System.out.printf("%d is NOT a leap year", year);
        }
    }
}

