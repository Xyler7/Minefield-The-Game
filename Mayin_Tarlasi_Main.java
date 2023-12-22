import java.util.Scanner;

public class Mayin_Tarlasi_Main {

	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int row, column;
	
		System.out.println("Mayin Tarlasina Hos Geldiniz!");
		System.out.println("Lutfen oynamak istediginiz boyutları girin! ");
		System.out.print("Satir Sayisi: ");
		row= scan.nextInt();
		System.out.print("Sutun Sayisi: ");
		column= scan.nextInt();
		
		MayinTarlasi mayin= new MayinTarlasi(row, column);
		mayin.run();
		}

}
