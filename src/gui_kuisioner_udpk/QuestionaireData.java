package gui_kuisioner_udpk;

import java.util.ArrayList;

/**
 *
 * @author Kelompok 8
    Briel Sevtriobragi Sihaloho (222212539)
    Dewi Nurihandayani (222212564)
    Fickry Atmayoga Wienaldi (222212610)
    La Ode Muhammad Gazali (222212696)
 * 
 */

public class QuestionaireData {
    private Perusahaan perusahaan;
    private String statusUsaha;
    private String gred;
    private String badanUsaha;
    private String pekerjaanUtama;
    private String bidangPekerjaanUtama;
    private String tempatUsaha;
    private int banyakPekerjaLaki;
    private int banyakPekerjaPerempuan;
    private String contactPerson;
    private String jabatan_cp;
    private String pencacah;
    private String pengawas;
    private String catatan;
    private String jabatanPengawas;
    private String jabatanPencacah;

    public String getJabatanPengawas() {
        return jabatanPengawas;
    }

    public void setJabatanPengawas(String jabatanPengawas) {
        this.jabatanPengawas = jabatanPengawas;
    }

    public String getJabatanPencacah() {
        return jabatanPencacah;
    }

    public void setJabatanPencacah(String jabatanPencacah) {
        this.jabatanPencacah = jabatanPencacah;
    }
    private String KIP;
    private String tanggalPencacahan;
    private String tanggalPengawasan;

    public String getKIP() {
        return KIP;
    }

    public void setKIP(String KIP) {
        this.KIP = KIP;
    }
    public Validator validasi;
    public ArrayList<String> error;

    public QuestionaireData() {
        validasi = new ValidatorQuestionaireData(this);
        error = new ArrayList<String>();
    }

    public Perusahaan getPerusahaan() {
        return perusahaan;
    }

    public void setPerusahaan(Perusahaan perusahaan) {
        this.perusahaan = perusahaan;
    }

    public String getStatusUsaha() {
        return statusUsaha;
    }

    public void setStatusUsaha(String statusUsaha) {
        this.statusUsaha = statusUsaha;
    }

    public String getGred() {
        return gred;
    }

    public void setGred(String gred) {
        this.gred = gred;
    }

    public String getBadanUsaha() {
        return badanUsaha;
    }

    public void setBadanUsaha(String badanUsaha) {
        this.badanUsaha = badanUsaha;
    }

    public String getPekerjaanUtama() {
        return pekerjaanUtama;
    }

    public void setPekerjaanUtama(String pekerjaanUtama) {
        this.pekerjaanUtama = pekerjaanUtama;
    }

    public String getBidangPekerjaanUtama() {
        return bidangPekerjaanUtama;
    }

    public void setBidangPekerjaanUtama(String bidangPekerjaanUtama) {
        this.bidangPekerjaanUtama = bidangPekerjaanUtama;
    }

    public String getTempatUsaha() {
        return tempatUsaha;
    }

    public void setTempatUsaha(String tempatUsaha) {
        this.tempatUsaha = tempatUsaha;
    }

    public int getBanyakPekerjaLaki() {
        return banyakPekerjaLaki;
    }

    public void setBanyakPekerjaLaki(int banyakPekerjaLaki) {
        this.banyakPekerjaLaki = banyakPekerjaLaki;
    }

    public int getBanyakPekerjaPerempuan() {
        return banyakPekerjaPerempuan;
    }

    public void setBanyakPekerjaPerempuan(int banyakPekerjaPerempuan) {
        this.banyakPekerjaPerempuan = banyakPekerjaPerempuan;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public String getJabatan_cp() {
        return jabatan_cp;
    }

    public void setJabatan_cp(String jabatan_cp) {
        this.jabatan_cp = jabatan_cp;
    }
    
    
    
    public String getPencacah() {
        return pencacah;
    }

    public void setPencacah(String pencacah) {
        this.pencacah = pencacah;
    }

    public String getPengawas() {
        return pengawas;
    }

    public void setPengawas(String pengawas) {
        this.pengawas = pengawas;
    }

    public String getCatatan() {
        return catatan;
    }

    public void setCatatan(String catatan) {
        this.catatan = catatan;
    }

    public String getTanggalPencacahan() {
        return tanggalPencacahan;
    }

    public void setTanggalPencacahan(String tanggalPencacahan) {
        this.tanggalPencacahan = tanggalPencacahan;
    }

    public String getTanggalPengawasan() {
        return tanggalPengawasan;
    }

    public void setTanggalPengawasan(String tanggalPengawasan) {
        this.tanggalPengawasan = tanggalPengawasan;
    }
    
    
}

