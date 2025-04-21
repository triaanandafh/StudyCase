public class MataKuliah {

    String kodeMK;
    String namaMK;
    int sks;

    MataKuliah(String kdMK, String nmMK, int sks) {
        this.kodeMK = kdMK;
        this.namaMK = nmMK;
        this.sks = sks;
    }

    void tampilMatakuliah() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("SKS: " + sks);
    }
}
