/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_kuisioner_udpk;

/**
 *
 * @author U53R
 */
import java.io.Serializable;
import java.sql.*;

public class Database implements Serializable{

    private static Database instance;
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "kuesioner_udpk";
    private final String DB_USER = "root";
    private final String DB_PASS = "";

    private Database() {
    }

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    // Method untuk membuat koneksi ke database
    private Connection connect() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:" + DB_TYPE + "://" + DB_HOST + ":" + DB_PORT + "/" + DB_NAME, DB_USER, DB_PASS);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return conn;
    }
    
    // Method untuk melakukan login
    public boolean login(String username, String password) {
        boolean loggedIn = false;
        String sql = "SELECT * FROM users WHERE username=? AND password=MD5(?)";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, username);
            stmt.setString(2, password);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                // Jika ada baris yang sesuai, login berhasil
                loggedIn = true;
                System.out.println("Login berhasil.");
            } else {
                // Jika tidak ada baris yang sesuai, login gagal
                System.out.println("Username atau password salah.");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return loggedIn;
    }

    // Method untuk menambahkan data perusahaan
    public void insertPerusahaan(Perusahaan perusahaan){
        String sql = "INSERT INTO perusahaan (KIP, nama_perusahaan, nama_pengusaha, alamat, kode_pos, telepon, fax, hp, provinsi, kode_provinsi, kab_kota, kode_kabkota, kecamatan, kode_kecamatan, desa_kelurahan, kode_desa_kelurahan, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = this.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, perusahaan.getKIP());
            stmt.setString(2, perusahaan.getNamaPerusahaan());
            stmt.setString(3, perusahaan.getNamaPengusaha());
            stmt.setString(4, perusahaan.getAlamat());
            stmt.setString(5, perusahaan.getKodePos());
            stmt.setString(6, perusahaan.getTelepon());
            stmt.setString(7, perusahaan.getFax());
            stmt.setString(8, perusahaan.getNoHP());
            stmt.setString(9, perusahaan.getProvinsi());
            stmt.setString(10, perusahaan.getKodeProv());
            stmt.setString(11, perusahaan.getKabupaten());
            stmt.setString(12, perusahaan.getKodeKab());
            stmt.setString(13, perusahaan.getKecamatan());
            stmt.setString(14, perusahaan.getKodeKec());
            stmt.setString(15, perusahaan.getDesa());
            stmt.setString(16, perusahaan.getKodeDes());
            stmt.setString(17, perusahaan.getEmail());
            stmt.executeUpdate();
            System.out.println("Data perusahaan berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk memperbarui data perusahaan berdasarkan KIP
    public void updatePerusahaan(String KIP, String namaPerusahaan, String namaPengusaha, String alamat, String kodePos,
                                  String telepon, String fax, String hp, String provinsi, String kodeProvinsi,
                                  String kabKota, String kodeKabKota, String kecamatan, String kodeKecamatan,
                                  String desaKelurahan, String kodeDesaKelurahan, String email) {
        String sql = "UPDATE perusahaan SET nama_perusahaan=?, nama_pengusaha=?, alamat=?, kode_pos=?, telepon=?, fax=?, hp=?, provinsi=?, kode_provinsi=?, kab_kota=?, kode_kabkota=?, kecamatan=?, kode_kecamatan=?, desa_kelurahan=?, kode_desa_kelurahan=?, email=? WHERE KIP=?";
        try (Connection conn = this.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, namaPerusahaan);
            stmt.setString(2, namaPengusaha);
            stmt.setString(3, alamat);
            stmt.setString(4, kodePos);
            stmt.setString(5, telepon);
            stmt.setString(6, fax);
            stmt.setString(7, hp);
            stmt.setString(8, provinsi);
            stmt.setString(9, kodeProvinsi);
            stmt.setString(10, kabKota);
            stmt.setString(11, kodeKabKota);
            stmt.setString(12, kecamatan);
            stmt.setString(13, kodeKecamatan);
            stmt.setString(14, desaKelurahan);
            stmt.setString(15, kodeDesaKelurahan);
            stmt.setString(16, email);
            stmt.setString(17, KIP);
            stmt.executeUpdate();
            System.out.println("Data perusahaan berhasil diperbarui.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk menghapus data perusahaan berdasarkan KIP
    public void deletePerusahaan(String KIP) {
        String sql = "DELETE FROM perusahaan WHERE KIP=?";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, KIP);
            stmt.executeUpdate();
            System.out.println("Data perusahaan berhasil dihapus.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk mendapatkan data perusahaan berdasarkan KIP
    public void getPerusahaan(String KIP) {
        String sql = "SELECT * FROM perusahaan WHERE KIP=?";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, KIP);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("KIP: " + rs.getString("KIP"));
                System.out.println("Nama Perusahaan: " + rs.getString("nama_perusahaan"));
                System.out.println("Nama Pengusaha: " + rs.getString("nama_pengusaha"));
                System.out.println("Alamat: " + rs.getString("alamat"));
                System.out.println("Kode Pos: " + rs.getString("kode_pos"));
                System.out.println("Telepon: " + rs.getString("telepon"));
                System.out.println("Fax: " + rs.getString("fax"));
                System.out.println("HP: " + rs.getString("hp"));
                System.out.println("Provinsi: " + rs.getString("provinsi"));
                System.out.println("Kode Provinsi: " + rs.getString("kode_provinsi"));
                System.out.println("Kabupaten/Kota: " + rs.getString("kab_kota"));
                System.out.println("Kode Kabupaten/Kota: " + rs.getString("kode_kabkota"));
                System.out.println("Kecamatan: " + rs.getString("kecamatan"));
                System.out.println("Kode Kecamatan: " + rs.getString("kode_kecamatan"));
                System.out.println("Desa/Kelurahan: " + rs.getString("desa_kelurahan"));
                System.out.println("Kode Desa/Kelurahan: " + rs.getString("kode_desa_kelurahan"));
                System.out.println("Email: " + rs.getString("email"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk menambahkan data kuisioner
    public void insertKuisioner(String KIP, QuestionaireData qd, String namaPengawas, String namaPencacah, String contactPerson) {
        String sql = "INSERT INTO kuisioner (KIP, status_perusahaan, kualifikasi_perusahaan, badan_hukum, jenis_borongan, bidang_pekerjaan, tempat_usaha, banyak_pekerja_LK, banyak_pekerja_PR, nama_pengawas, nama_pencacah, contact_person) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, KIP);
            stmt.setString(2, qd.getStatusUsaha());
            stmt.setString(3, qd.getGred());
            stmt.setString(4, qd.getBadanUsaha());
            stmt.setString(5, qd.getPekerjaanUtama());
            stmt.setString(6, qd.getBidangPekerjaanUtama());
            stmt.setString(7, qd.getTempatUsaha());
            stmt.setString(8, Integer.toString(qd.getBanyakPekerjaLaki()));
            stmt.setString(9, Integer.toString(qd.getBanyakPekerjaPerempuan()));
            stmt.setString(10, namaPengawas);
            stmt.setString(11, namaPencacah);
            stmt.setString(12, contactPerson);
            stmt.executeUpdate();
            System.out.println("Data kuisioner berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    // Method untuk memperbarui data kuisioner berdasarkan KIP
    public void updateKuisioner(String KIP, String statusPerusahaan, String kualifikasiPerusahaan, String badanHukum, String jenisBorongan,
                                String bidangPekerjaan, String tempatUsaha, String banyakPekerjaLK, String banyakPekerjaPR,
                                String namaPengawas, String namaPencacah, String contactPerson) {
        String sql = "UPDATE kuisioner SET status_perusahaan=?, kualifikasi_perusahaan=?, badan_hukum=?, jenis_borongan=?, bidang_pekerjaan=?, tempat_usaha=?, banyak_pekerja_LK=?, banyak_pekerja_PR=?, nama_pengawas=?, nama_pencacah=?, contact_person=? WHERE KIP=?";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, statusPerusahaan);
            stmt.setString(2, kualifikasiPerusahaan);
            stmt.setString(3, badanHukum);
            stmt.setString(4, jenisBorongan);
            stmt.setString(5, bidangPekerjaan);
            stmt.setString(6, tempatUsaha);
            stmt.setString(7, banyakPekerjaLK);
            stmt.setString(8, banyakPekerjaPR);
            stmt.setString(9, namaPengawas);
            stmt.setString(10, namaPencacah);
            stmt.setString(11, contactPerson);
            stmt.setString(12, KIP);
            stmt.executeUpdate();
            System.out.println("Data kuisioner berhasil diperbarui.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    // Method untuk menghapus data kuisioner berdasarkan KIP
    public void deleteKuisioner(String KIP) {
        String sql = "DELETE FROM kuisioner WHERE KIP=?";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, KIP);
            stmt.executeUpdate();
            System.out.println("Data kuisioner berhasil dihapus.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


    public void getKuisioner(String KIP) {
        String sql = "SELECT * FROM kuisioner WHERE KIP=?";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, KIP);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("KIP: " + rs.getString("KIP"));
                System.out.println("Status Perusahaan: " + rs.getString("status_perusahaan"));
                System.out.println("Kualifikasi Perusahaan: " + rs.getString("kualifikasi_perusahaan"));
                System.out.println("Badan Hukum: " + rs.getString("badan_hukum"));
                System.out.println("Jenis Borongan: " + rs.getString("jenis_borongan"));
                System.out.println("Bidang Pekerjaan: " + rs.getString("bidang_pekerjaan"));
                System.out.println("Tempat Usaha: " + rs.getString("tempat_usaha"));
                System.out.println("Banyak Pekerja Laki-laki: " + rs.getString("banyak_pekerja_LK"));
                System.out.println("Banyak Pekerja Perempuan: " + rs.getString("banyak_pekerja_PR"));
                System.out.println("Nama Pengawas: " + rs.getString("nama_pengawas"));
                System.out.println("Nama Pencacah: " + rs.getString("nama_pencacah"));
                System.out.println("Contact Person: " + rs.getString("contact_person"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
   

    // Method untuk menambahkan data person
    public void insertPerson(String nama, String jabatan, String keteranganPetugas, String catatan) {
        String sql = "INSERT INTO person (nama, jabatan, keterangan_petugas, catatan) VALUES (?, ?, ?, ?)";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nama);
            stmt.setString(2, jabatan);
            stmt.setString(3, keteranganPetugas);
            stmt.setString(4, catatan);
            stmt.executeUpdate();
            System.out.println("Data person berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk memperbarui data person berdasarkan id
    public void updatePerson(int id, String nama, String jabatan, String keteranganPetugas, String catatan) {
        String sql = "UPDATE person SET nama=?, jabatan=?, keterangan_petugas=?, catatan=? WHERE id=?";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nama);
            stmt.setString(2, jabatan);
            stmt.setString(3, keteranganPetugas);
            stmt.setString(4, catatan);
            stmt.setInt(5, id);
            stmt.executeUpdate();
            System.out.println("Data person berhasil diperbarui.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk menghapus data person berdasarkan id
    public void deletePerson(int id) {
        String sql = "DELETE FROM person WHERE id=?";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Data person berhasil dihapus.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk mendapatkan data person berdasarkan id
    public void getPerson(int id) {
        String sql = "SELECT * FROM person WHERE id=?";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nama: " + rs.getString("nama"));
                System.out.println("Jabatan: " + rs.getString("jabatan"));
                System.out.println("Keterangan Petugas: " + rs.getString("keterangan_petugas"));
                System.out.println("Catatan: " + rs.getString("catatan"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

       
    
}
