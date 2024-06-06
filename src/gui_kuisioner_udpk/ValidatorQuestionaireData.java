package gui_kuisioner_udpk;

/**
 *
 * @author Kelompok 8
    Briel Sevtriobragi Sihaloho (222212539)
    Dewi Nurihandayani (222212564)
    Fickry Atmayoga Wienaldi (222212610)
    La Ode Muhammad Gazali (222212696)
 * 
 */

public class ValidatorQuestionaireData implements Validator {
    private QuestionaireData questionaireData; // Objek QuestionaireData yang akan divalidasi

    public ValidatorQuestionaireData(QuestionaireData questionaireData) {
        this.questionaireData = questionaireData;
    }

    @Override
    public boolean validate() {
        // Lakukan validasi untuk semua atribut QuestionaireData
        // Anda dapat menyesuaikan validasi sesuai kebutuhan
        
        // Contoh validasi untuk status usaha
        if ("<None Selected>".equals(questionaireData.getStatusUsaha())) {
            questionaireData.error.add("Status usaha harus dipilih");
        }
        if(questionaireData.getStatusUsaha() == "Aktif Lama" || questionaireData.getStatusUsaha() == "Aktif Baru") {
            // Validasi untuk gred
            if ("<None Selected>".equals(questionaireData.getGred())) {
                questionaireData.error.add("Gred harus dipilih");
            }

            // Validasi untuk atribut badan usaha
            if ("<None Selected>".equals(questionaireData.getBadanUsaha())) {
                questionaireData.error.add("Badan usaha harus antara 1-7");
            }

            // Validasi untuk atribut pekerjaan utama
            if (!isValidString(questionaireData.getPekerjaanUtama())) {
                questionaireData.error.add("Pekerjaan utama tidak boleh kosong");
            }

            // Validasi untuk atribut bidang pekerjaan utama
            if ("<None Selected>".equals(questionaireData.getBidangPekerjaanUtama())) {
                questionaireData.error.add("Bidang pekerjaan utama harus dipilih");
            }

            // Validasi untuk atribut tempat usaha
            if ("<None Selected>".equals(questionaireData.getTempatUsaha())) {
                questionaireData.error.add("Tempat usaha harus dipilih");
            }

            // Validasi untuk atribut banyak pekerja tetap
            if (!(questionaireData.getBanyakPekerjaLaki() + questionaireData.getBanyakPekerjaPerempuan() >= 0)){
                questionaireData.error.add("Banyak pekerja tetap tidak boleh bernilai negatif");
            }

        }
        // Jika semua validasi berhasil, kembalikan true
        return questionaireData.error.isEmpty();
    
    }

    // Metode bantuan untuk memeriksa apakah string tidak kosong
    private boolean isValidString(String str) {
        return str != null && !str.trim().isEmpty();
    }

    @Override
    public boolean save() {
        System.out.println("Save here...");
        return true;
    }

    @Override
    public void print() {
        // Mencetak informasi QuestionaireData
        System.out.println("Perusahaan : " + questionaireData.getPerusahaan().getNamaPerusahaan());
        System.out.print("Status Usaha: ");
        switch(questionaireData.getStatusUsaha()) {
            case "1": System.out.println("Aktif Lama"); break;
            case "2": System.out.println("Aktif Baru"); break;
            case "3": System.out.println("Tutup"); break;
            case "4": System.out.println("Tidak Ditemukan"); break;
            case "5": System.out.println("Bukan Konstruksi"); break;
        }
        
        System.out.println("Gred: " + questionaireData.getGred());
        System.out.print("Badan Hukum/Badan Usaha: ");
        switch(questionaireData.getBadanUsaha()) {
            case "1": System.out.println("PT. Persero"); break;
            case "2": System.out.println("PT"); break;
            case "3": System.out.println("CV"); break;
            case "4": System.out.println("Firma"); break;
            case "5": System.out.println("Koperasi"); break;
            case "6": System.out.println("Perorangan"); break;
            case "7": System.out.println("Lainnya"); break;
        }
        System.out.println("Pekerjaan Utama: " + questionaireData.getPekerjaanUtama());
        System.out.print("Bidang Pekerjaan Utama: ");
        switch(questionaireData.getBidangPekerjaanUtama()) {
            case "1": System.out.println("Konstruksi Gedung"); break;
            case "2": System.out.println("Konstruksi Sipil"); break;
            case "3": System.out.println("Konstruksi Khusus"); break;
        }
        System.out.print("Tempat Usaha: ");
        switch(questionaireData.getTempatUsaha()) {
            case "1": System.out.println("Kantor"); break;
            case "2": System.out.println("Rumah Tinggal"); break;
            case "3": System.out.println("Rukan"); break;
            default : System.out.println("Lainnya : " + questionaireData.getTempatUsaha()); break;
        }
        System.out.println("Banyak Pekerja Laki-laki: " + questionaireData.getBanyakPekerjaLaki());
        System.out.println("Banyak Pekerja Perempuan: " + questionaireData.getBanyakPekerjaPerempuan());

        System.out.println("Contact Person: " + questionaireData.getContactPerson());
        System.out.println("Pencacah: " + questionaireData.getPencacah());
        System.out.println("Pengawas: " + questionaireData.getPengawas());
        System.out.println("Catatan: " + questionaireData.getCatatan());
    }

    @Override
    public void reset() {
        // Mereset semua atribut dalam objek QuestionaireData
        questionaireData.setStatusUsaha("0");
        questionaireData.setGred("0");
        questionaireData.setBadanUsaha("0");
        questionaireData.setPekerjaanUtama("");
        questionaireData.setBidangPekerjaanUtama("0");
        questionaireData.setTempatUsaha("0");
        questionaireData.setBanyakPekerjaLaki(0);
        questionaireData.setBanyakPekerjaPerempuan(0);
        questionaireData.setContactPerson(null);
        questionaireData.setPencacah(null);
        questionaireData.setPengawas(null);
        questionaireData.setCatatan("");
        // Reset atribut lainnya sesuai kebutuhan
    }
}
