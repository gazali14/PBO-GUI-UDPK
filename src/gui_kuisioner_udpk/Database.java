/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_kuisioner_udpk;

/**
 *
 * @author U53R
 */
import java.sql.*;

public class Database {

    private static Database instance;
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "kuisioner_udpk";
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
    public void insertPerusahaan(String KIP, String namaPerusahaan, String namaPengusaha, String alamat, String kodePos,
                                  String telepon, String fax, String hp, String provinsi, String kodeProvinsi,
                                  String kabKota, String kodeKabKota, String kecamatan, String kodeKecamatan,
                                  String desaKelurahan, String kodeDesaKelurahan, String email) {
        String sql = "INSERT INTO perusahaan (KIP, nama_perusahaan, nama_pengusaha, alamat, kode_pos, telepon, fax, hp, provinsi, kode_provinsi, kab_kota, kode_kabkota, kecamatan, kode_kecamatan, desa_kelurahan, kode_desa_kelurahan, email) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, KIP);
            stmt.setString(2, namaPerusahaan);
            stmt.setString(3, namaPengusaha);
            stmt.setString(4, alamat);
            stmt.setString(5, kodePos);
            stmt.setString(6, telepon);
            stmt.setString(7, fax);
            stmt.setString(8, hp);
            stmt.setString(9, provinsi);
            stmt.setString(10, kodeProvinsi);
            stmt.setString(11, kabKota);
            stmt.setString(12, kodeKabKota);
            stmt.setString(13, kecamatan);
            stmt.setString(14, kodeKecamatan);
            stmt.setString(15, desaKelurahan);
            stmt.setString(16, kodeDesaKelurahan);
            stmt.setString(17, email);
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
                // Lanjutkan dengan menampilkan sisa kolom
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk menambahkan data kuisioner
    public void insertKuisioner(String KIP, String statusPerusahaan, String kualifikasiPerusahaan, String badanHukum, String jenisBorongan,
                                String bidangPekerjaan, String tempatUsaha, String banyakPekerjaLK, String banyakPekerjaPR) {
        String sql = "INSERT INTO kuisioner (KIP, status_perusahaan, kualifikasi_perusahaan, badan_hukum, jenis_borongan, bidang_pekerjaan, tempat_usaha, banyak_pekerja_LK, banyak_pekerja_PR) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, KIP);
            stmt.setString(2, statusPerusahaan);
            stmt.setString(3, kualifikasiPerusahaan);
            stmt.setString(4, badanHukum);
            stmt.setString(5, jenisBorongan);
            stmt.setString(6, bidangPekerjaan);
            stmt.setString(7, tempatUsaha);
            stmt.setString(8, banyakPekerjaLK);
            stmt.setString(9, banyakPekerjaPR);
            stmt.executeUpdate();
            System.out.println("Data kuisioner berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk memperbarui data kuisioner berdasarkan KIP
    public void updateKuisioner(String KIP, String statusPerusahaan, String kualifikasiPerusahaan, String badanHukum, String jenisBorongan,
                                String bidangPekerjaan, String tempatUsaha, String banyakPekerjaLK, String banyakPekerjaPR) {
        String sql = "UPDATE kuisioner SET status_perusahaan=?, kualifikasi_perusahaan=?, badan_hukum=?, jenis_borongan=?, bidang_pekerjaan=?, tempat_usaha=?, banyak_pekerja_LK=?, banyak_pekerja_PR=? WHERE KIP=?";
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
            stmt.setString(9, KIP);
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

    // Method untuk mendapatkan data kuisioner berdasarkan KIP
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
                // Lanjutkan dengan menampilkan sisa kolom
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
                System.out.println("Keterangan Petugas: " + rs.getString("keteranganPetugas"));
                System.out.println("Catatan: " + rs.getString("catatan"));
               
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
