
package bai24.pkg8;

import java.util.Scanner;



public class bai2tentuoi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap HO va TEN:");
        String name = scanner.nextLine();
        System.out.println("Nhap nam sinh:");
        int nam =scanner.nextInt();
        System.out.println("Nhap tuoi:");
        int tuoi = scanner.nextInt();
        System.out.println("Nhap GPA:");
        float GPA=scanner.nextFloat();
        scanner.nextLine();
        System.out.println("Nhap que quan:");
        String que = scanner.nextLine();
        System.out.println("Ten:"+name);
        System.out.println("Nam Sinh:"+nam);
        System.out.println("Tuoi: "+tuoi);
        System.out.println("GPA:"+GPA);
        System.out.println("Que quan: "+que);
       
    }
    
}
