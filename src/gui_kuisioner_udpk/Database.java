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
import java.util.ArrayList;
import java.util.List;

public class Database implements Serializable{

    private static Database instance;
    private final String DB_TYPE = "mysql";
    private final String DB_HOST = "localhost";
    private final String DB_PORT = "3306";
    private final String DB_NAME = "kuisioner_udpk";
    private final String DB_USER = "root";
    private final String DB_PASS = "";
    public String username = "";

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
                this.username = username;
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

    public void insertKuisioner(String KIP, QuestionaireData qd, String namaPengawas, String namaPencacah, String contactPerson, String cp_jabatan, String tglPengawasan, String tglPencacahan, String catatan) {
        String sql = "INSERT INTO kuisioner (KIP, status_perusahaan, kualifikasi_perusahaan, badan_hukum, jenis_borongan, bidang_pekerjaan, tempat_usaha, banyak_pekerja_LK, banyak_pekerja_PR, nama_pengawas, nama_pencacah, contact_person, jabatan_cp, tgl_pengawasan, tgl_pencacahan, catatan) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            stmt.setString(13, cp_jabatan);
            stmt.setString(14, tglPencacahan);
            stmt.setString(15, tglPengawasan);
            stmt.setString(16, catatan);
            stmt.executeUpdate();
            System.out.println("Data kuisioner berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk memperbarui data kuisioner berdasarkan KIP
    
    public void updateKuisioner(String KIP, String statusPerusahaan, String kualifikasiPerusahaan, String badanHukum, String jenisBorongan, String bidangPekerjaan, String tempatUsaha, String banyakPekerjaLK, String banyakPekerjaPR, String namaPengawas, String namaPencacah, String contactPerson, String tglPengawasan, String tglPencacahan, String catatan) {
        String sql = "UPDATE kuisioner SET status_perusahaan=?, kualifikasi_perusahaan=?, badan_hukum=?, jenis_borongan=?, bidang_pekerjaan=?, tempat_usaha=?, banyak_pekerja_LK=?, banyak_pekerja_PR=?, nama_pengawas=?, nama_pencacah=?, contact_person=?, tgl_pengawasan=?, tgl_pencacahan=?, catatan=? WHERE KIP=?";
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
            stmt.setString(12, tglPengawasan);
            stmt.setString(13, tglPencacahan);
            stmt.setString(14, catatan);
            stmt.setString(15, KIP);
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
    
    
        
    // Method untuk mendapatkan data perusahaan berdasarkan KIP
    public Perusahaan getPerusahaanByKIP(String KIP) {
        String sql = "SELECT * FROM perusahaan WHERE KIP=?";
        Perusahaan perusahaan = new Perusahaan();
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, KIP);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    perusahaan.setKIP(rs.getString("KIP"));
                    perusahaan.setNamaPerusahaan(rs.getString("nama_perusahaan"));
                    perusahaan.setNamaPengusaha(rs.getString("nama_pengusaha"));
                    perusahaan.setAlamat(rs.getString("alamat"));
                    perusahaan.setKodePos(rs.getString("kode_pos"));
                    perusahaan.setTelepon(rs.getString("telepon"));
                    perusahaan.setFax(rs.getString("fax"));
                    perusahaan.setNoHP(rs.getString("hp"));
                    perusahaan.setProvinsi(rs.getString("provinsi"));
                    perusahaan.setKodeProv(rs.getString("kode_provinsi"));
                    perusahaan.setKabupaten(rs.getString("kab_kota"));
                    perusahaan.setKodeKab(rs.getString("kode_kabkota"));
                    perusahaan.setKecamatan(rs.getString("kecamatan"));
                    perusahaan.setKodeKec(rs.getString("kode_kecamatan"));
                    perusahaan.setDesa(rs.getString("desa_kelurahan"));
                    perusahaan.setKodeDes(rs.getString("kode_desa_kelurahan"));
                    perusahaan.setEmail(rs.getString("email"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return perusahaan;
    }

    
public QuestionaireData getKuisionerByKIP(String KIP) {
    String sql = "SELECT * FROM kuisioner WHERE KIP=?";
    QuestionaireData kuisioner = new QuestionaireData();
    try (Connection conn = this.connect();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, KIP);
        ResultSet rs = stmt.executeQuery();
        if (rs.next()) {
            kuisioner.setKIP(rs.getString("KIP"));
            kuisioner.setStatusUsaha(rs.getString("status_perusahaan"));
            kuisioner.setGred(rs.getString("kualifikasi_perusahaan"));
            kuisioner.setBadanUsaha(rs.getString("badan_hukum"));
            kuisioner.setPekerjaanUtama(rs.getString("jenis_borongan"));
            kuisioner.setBidangPekerjaanUtama(rs.getString("bidang_pekerjaan"));
            kuisioner.setTempatUsaha(rs.getString("tempat_usaha"));
            kuisioner.setBanyakPekerjaLaki(rs.getInt("banyak_pekerja_LK"));
            kuisioner.setBanyakPekerjaPerempuan(rs.getInt("banyak_pekerja_PR"));
            kuisioner.setPengawas(rs.getString("nama_pengawas"));
            kuisioner.setPencacah(rs.getString("nama_pencacah"));
            kuisioner.setContactPerson(rs.getString("contact_person"));
            kuisioner.setJabatan_cp(rs.getString("jabatan_cp"));
            kuisioner.setTanggalPengawasan(rs.getString("tgl_pengawasan"));
            kuisioner.setTanggalPencacahan(rs.getString("tgl_pencacahan"));
            kuisioner.setCatatan(rs.getString("catatan"));
        }
    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
    return kuisioner;
}

    // Method untuk menambahkan data person
    public void insertPerson(String nama, String jabatan, String keteranganPetugas) {
        String sql = "INSERT INTO person (nama, jabatan, keterangan_petugas) VALUES (?, ?, ?)";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nama);
            stmt.setString(2, jabatan);
            stmt.setString(3, keteranganPetugas);
            stmt.executeUpdate();
            System.out.println("Data person berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    // Method untuk memperbarui data person berdasarkan id
    public void updatePerson(int id, String nama, String jabatan, String keteranganPetugas) {
        String sql = "UPDATE person SET nama=?, jabatan=?, keterangan_petugas=? WHERE id=?";
        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.setString(2, nama);
            stmt.setString(3, jabatan);
            stmt.setString(4, keteranganPetugas);
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
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public Pencacah getPencacah(String nama) {
        String sql = "SELECT * FROM person WHERE nama=?";
        Pencacah pencacah = new Pencacah();
        try (Connection conn = this.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nama);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pencacah.setNama(rs.getString("nama"));
                pencacah.setJabatan(rs.getString("jabatan"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pencacah;
    }
    
    public Pengawas getPengawas(String nama) {
        String sql = "SELECT * FROM person WHERE nama=?";
        Pengawas pengawas = new Pengawas();
        try (Connection conn = this.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nama);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                pengawas.setNama(rs.getString("nama"));
                pengawas.setJabatan(rs.getString("jabatan"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return pengawas;
    }
    
    public void setJabatanPencacah(String pencacahId, String jabatan) throws SQLException {
        String query = "UPDATE Pencacah SET jabatan = ? WHERE id = ?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, jabatan);
            pstmt.setString(2, pencacahId);
            pstmt.executeUpdate();
        }
    }

    public void setJabatanPengawas(String pengawasId, String jabatan) throws SQLException {
        String query = "UPDATE Pengawas SET jabatan = ? WHERE id = ?";
        try (Connection conn = this.connect();
             PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, jabatan);
            pstmt.setString(2, pengawasId);
            pstmt.executeUpdate();
        }
    }
    
    // Method to check if a person exists based on name
    public boolean checkPersonByName(String nama) {
        String sql = "SELECT * FROM person WHERE nama=?";
        try (Connection conn = this.connect();
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, nama);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return false;
    }
        // Method untuk mendapatkan daftar perusahaan dari database
    public List<Perusahaan> getPerusahaanList() {
        List<Perusahaan> perusahaanList = new ArrayList<>();

        // Query untuk mengambil data perusahaan dari tabel perusahaan
        String sql = "SELECT KIP, nama_perusahaan FROM perusahaan";

        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Perusahaan perusahaan = new Perusahaan();
                perusahaan.setKIP(rs.getString("KIP"));
                perusahaan.setNamaPerusahaan(rs.getString("nama_perusahaan"));
                // Tetapkan atribut lainnya sesuai kebutuhan
                perusahaanList.add(perusahaan);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle kesalahan query
        }

        return perusahaanList;
    }

    // Method untuk mendapatkan daftar kuisioner dari database
    public List<QuestionaireData> getKuisionerList() {
        List<QuestionaireData> kuisionerList = new ArrayList<>();

        // Query untuk mengambil data kuisioner dari tabel kuisioner
        String sql = "SELECT KIP, nama_pengawas, nama_pencacah FROM kuisioner";

        try (Connection conn = this.connect();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                QuestionaireData kuisioner = new QuestionaireData();
                kuisioner.setKIP(rs.getString("KIP"));
                kuisioner.setPengawas(rs.getString("nama_pengawas"));
                kuisioner.setPencacah(rs.getString("nama_pencacah"));
                // Tetapkan atribut lainnya sesuai kebutuhan
                kuisionerList.add(kuisioner);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle kesalahan query
        }

        return kuisionerList;
    }
}
