import java.util.Scanner;

public class StudiKasus1_2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaPerCup, jumlahCup, uangBayar, totalHarga, kembalian, kurang;
        double diskon, totalBayar;

        hargaPerCup = 15000 + (18 % 6) * 1000;
        
         
        System.out.print("Masukkan jumlah cup \t: ");
        jumlahCup = sc.nextInt();
        System.out.print("Masukkan uang bayar \t: ");
        uangBayar = sc.nextInt();
        
        totalHarga = jumlahCup * hargaPerCup;
        System.out.println("Total harga \t\t: " + totalHarga);

        if (totalHarga >= 100000) {
            diskon = (5 + (18 % 5))/100.0;
        } else {
            diskon = 0;
        } 
        
        totalBayar = totalHarga - (totalHarga * diskon);
        kurang =(int) totalBayar - uangBayar;

        System.out.println("Diskon \t\t\t: " + diskon*100 + "%");
        System.out.println("Total bayar \t\t: " + totalBayar);
        
        if (uangBayar >= totalBayar) {
            kembalian = (int) (uangBayar - totalBayar);
            System.out.println("Kembalian \t\t: " + kembalian);
        } else {
            kurang = (int) totalBayar - uangBayar;
            System.out.println("Uang tidak cukup, kurang Rp. " + kurang);
        }
        
sc.close();    }
}
