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

public class ValidatorPerson implements Validator {
    private Person person; // Objek Person yang akan divalidasi

    public ValidatorPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean validate(){
        // Lakukan validasi untuk semua atribut Person
        // Validasi untuk nama
        if (!isValidString(person.getNama()) || !person.getNama().matches("[a-zA-Z ]+")) {
            person.error.add("Nama tidak boleh kosong dan hanya mengandung huruf");
        }

        // Validasi untuk jabatan
        if (!isValidString(person.getJabatan())|| !person.getJabatan().matches("[a-zA-Z ]+")) {
            person.error.add("Jabatan tidak boleh kosong dan hanya mengandung huruf");
        }

        // Jika semua validasi berhasil, kembalikan true
        return person.error.isEmpty();
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
        // Mencetak informasi person
        System.out.println("Nama: " + person.getNama());
        System.out.println("Jabatan: " + person.getJabatan());
    }

    @Override
    public void reset() {
        // Mereset semua atribut dalam objek Person
        person.setNama("");
        person.setJabatan("");
    }
}

