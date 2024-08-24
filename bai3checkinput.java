
package bai24.pkg8;

import java.util.Scanner;

public class bai3checkinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter data: ");
        boolean check1=scanner.hasNextInt();//kiểm tra dữ liệu vào có số nguyên nào không
//        boolean check2=scanner.hasNextDouble()//Kiểm tra dữ liệu vào có số thực nào không
        System.out.println("Co token khong "+check1);
    }
    
}
