package minMaxBul;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int count,number,min=0,max=0;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.print("Ka� tane say� gireceksiniz: ");
		count=scan.nextInt();
		if(count>1) {
			for(int i=1; i<=count; i++) {
				System.out.print(i+". Say�y� giriniz: ");
				number=scan.nextInt();
				
				if(i==1) {
					min=number;
					max=number;
				}
				if(number>max) {
					max=number;
				}
				if(number<min) {
					min=number;
				}
				
			}
			System.out.println("En b�y�k say�: "+max);
			System.out.println("En k���k say�: "+min);
		}else {
			System.out.println("En az iki adet de�er giri�ine izin verilmektedir!!!");
		}
		

	}

}
