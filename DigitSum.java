package main;
import java.util.Scanner;
import java.text.NumberFormat;
public class DigitSum {
	public static void main(String[] args) {
		int sayı,uzunluk;
		int toplam = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		sayı = scan.nextInt();
		System.out.println("Enter a number of length: ");
		uzunluk = scan.nextInt();
		for(int i=0;i<uzunluk;i++) {
			toplam+= (sayı / Math.pow(10,i)) % 10;
		}
		System.out.println("Result is:" + toplam);
	}
}
