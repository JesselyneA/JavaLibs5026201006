import javax.swing.JOptionPane;

public class JavaLibs5026201006 {
    public static void main (String [] args)
    {
    JOptionPane.showMessageDialog( null, "Halo! Pesan tiket pesawat murah hanya di LiburanYuk." +
    "\nAgar pesanan anda dapat kami proses, mohon lengkapi data berikut!");
    String nama = JOptionPane.showInputDialog ("Nama Penumpang");
    String tanggallahir = JOptionPane.showInputDialog ("Tanggal Lahir");
    String kwn = JOptionPane.showInputDialog ("Kewarganegaraan"); 
    String email = JOptionPane.showInputDialog ("Alamat Email");
    String telpon = JOptionPane.showInputDialog ("No Telepon");
    String maskapai = JOptionPane.showInputDialog ("Ketik Maskapai Penerbangan");
    String kotaasal = JOptionPane.showInputDialog ("Kota Asal");
    String kotatujuan = JOptionPane.showInputDialog ("Kota Tujuan");
    String tanggalkeberangkatan = JOptionPane.showInputDialog ("Tanggal Keberangkatan");
    String jumlahpenumpang = JOptionPane.showInputDialog ("Jumlah Penumpang");
    String penumpangdewasa = JOptionPane.showInputDialog ("Jumlah Penumpang Dewasa");
    String penumpanganak = JOptionPane.showInputDialog ("Jumlah Penumpang Anak");
    String penumpangbayi = JOptionPane.showInputDialog ("Jumlah Penumpang Bayi");
    String beratbagasi = JOptionPane.showInputDialog ("Berat Bagasi (Rentang 7.5 hingga 20 Kg)");
    
    int jumlah = Integer.parseInt(jumlahpenumpang);
    int dewasa = Integer.parseInt(penumpangdewasa);
    int anak = Integer.parseInt(penumpanganak);
    int bayi = Integer.parseInt(penumpangbayi);
    double bagasi = Double.parseDouble(beratbagasi);
    
    int tiket1 = dewasa*800000;
    int tiket2 = anak*800000;
    int tiket3 = bayi*160000;
    int tiket = tiket1+tiket2+tiket3;
    double berat = bagasi*50000;
    double total = tiket+berat;
    
    
    JOptionPane.showMessageDialog(null, "Mohon periksa kembali data-data yang sudah anda input." + 
    "\nPesanan tiket atas nama" + " " + nama + "." + " " + "Tanggal lahir" + " " + tanggallahir + "." + " " + "Kewarganegaraan" + " " + kwn + "." +
    "\nKeberangkatan dari" + " " + kotaasal + " " + "menuju" + " " + kotatujuan + " " + "dengan maskapai" + " " + maskapai + " " +  "pada tanggal" + " " + tanggalkeberangkatan + "." +
    "\nJumlah penumpang sebanyak" + " " + jumlahpenumpang + " " + "orang, terdiri dari" + " " + penumpangdewasa + " " + "dewasa," + " " + penumpanganak + " " + "anak," + " " + "dan" + " " + penumpangbayi + " " + "bayi." + " " + "Bagasi seberat" + " " + beratbagasi + " " + "Kg." + 
    "\nTotal pembayaran sejumlah Rp" + total + ", dengan rincian : " + 
    "\n1. Pembayaran bagasi Rp" + berat +  
    "\n2. Pembayaran tiket Rp" + tiket +
    "\nTiket akan dikirimkan melalui" + " " + email + "." + " " + "Apabila ada perubahan jadwal, akan disampaikan melalui Email tertera dan pesan ke nomor" + " " + telpon + "."); 
    
    JOptionPane.showMessageDialog(null, "Pesanan anda akan segera kami proses. Terimakasih sudah melakukan pemesanan melalui LiburanYuk." + 
    "\nHave a nice day!");

    }
}