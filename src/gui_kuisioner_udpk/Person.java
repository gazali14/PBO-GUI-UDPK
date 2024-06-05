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

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;

public abstract class Person {
    private String nama;
    private String jabatan;
    private String keterangan;
    public ArrayList<String> error;
    Validator validasi;

    public Person() {
        validasi = new ValidatorPerson(this);
        error = new ArrayList<>();
    }

    // Getter dan setter untuk semua atribut
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public Validator getValidasi() {
        return validasi;
    }

    public void setValidasi(Validator validasi) {
        this.validasi = validasi;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public ArrayList<String> getError() {
        return error;
    }

    @Override
    public abstract String toString();
}

class Pencacah extends Person{
    public Pencacah() {
        this.setKeterangan("Pencacah");
    }

    @Override
    public String toString() {
        return "Pencacah["+this.getNama()+","+this.getJabatan()+"]";
    }
}

class Pengawas extends Person{
    public Pengawas() {
        this.setKeterangan("Pengawas");
    }
    @Override
    public String toString() {
        return "Pengawas["+this.getNama()+","+this.getJabatan()+"]";
    }
}

class ContactPerson extends Person{
    public ContactPerson() {
        this.setKeterangan("Contact Person");
    }
    @Override
    public String toString() {
        return "ContactPerson["+this.getNama()+","+this.getJabatan()+"]";
    }
    
}