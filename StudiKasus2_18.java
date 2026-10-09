import java.util.Scanner;

public class StudiKasus2_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String namaMahasiswa, jenisKegiatan;
        int jumlahDokumen, peringkat, syaratDokumen;
        boolean status;

        System.out.print("Masuskkan nama mahasiswa : ");
        namaMahasiswa = sc.nextLine();
        System.out.print("Masukkan jenis kegiatan(BELMAWA, BAKORMA, MANDIRI atau LAINNYA) : ");
        jenisKegiatan = sc.nextLine();
        System.out.print("Masukkan jumlah dokumen : ");
        jumlahDokumen = sc.nextInt();
        
            if (jumlahDokumen == 4) {
                if (jenisKegiatan.equalsIgnoreCase("BAKORMA")||jenisKegiatan.equalsIgnoreCase("Belmawa")||jenisKegiatan.equalsIgnoreCase("Mandiri")) {
                    System.out.print("Masukkan peringkat : ");
                    peringkat = sc.nextInt();
                    if (peringkat >= 1 && peringkat <= 3) {
                        System.out.println("Status : Pendanaan diberikan karena memenuhi syarat");
                    } else {
                        System.out.println("Status : Pendanaan tidak diberikan karena tidak juara");
                    } 
                    
                } else {
                     if (jenisKegiatan.equalsIgnoreCase("PKM")) {
                         System.out.println("Apakah anda lolos pendanaan?(true/false) : ");
                         status = sc.nextBoolean();
                         if (status == true) {
                             System.out.println("Status : Pendanaan diberikan");
                         } else {
                             System.out.println("Status : Pendanaan tidak diberikan");
                         }
                     } else {
                         System.out.println("Maaf, anda mengikuti kegiatan lain");
                     }
                }
            } else {
                syaratDokumen = 4 - jumlahDokumen;
               System.out.println("maaf, jumlah dokumen kurang " + syaratDokumen); 
            }
            if (jenisKegiatan.equalsIgnoreCase("lainnya")) {
                System.out.println("Tidak lolos");
            }
sc.close();
    }
}