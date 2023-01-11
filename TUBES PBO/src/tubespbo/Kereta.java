package tubespbo;
import java.util.ArrayList;
public class Kereta {
    private int idKereta, hargaTiket;
    private String namaKereta, gerbong, kelas, jadwalBerangkat, jadwalTiba, stasiunAsal, stasiunTujuan;
    private ArrayList<Kereta> kereta = new ArrayList<>();

    public Kereta(int idKereta, int hargaTiket, String namaKereta, String gerbong, String kelas, String jadwalBerangkat, String jadwalTiba, String stasiunAsal, String stasiunTujuan) {
        setIdKereta(idKereta);
        setHargaTiket(hargaTiket);
        setNamaKereta(namaKereta);
        setGerbong(gerbong);
        setKelas(kelas);
        setJadwalBerangkat(jadwalBerangkat);
        setJadwalTiba(jadwalTiba);
        setStasiunAsal(stasiunAsal);
        setStasiunTujuan(stasiunTujuan);
    }

    public int getIdKereta() {
        return idKereta;
    }

    public void setIdKereta(int idKereta) {
        this.idKereta = idKereta;
    }

    public int getHargaTiket() {
        return hargaTiket;
    }

    public void setHargaTiket(int hargaTiket) {
        this.hargaTiket = hargaTiket;
    }

    public String getNamaKereta() {
        return namaKereta;
    }

    public void setNamaKereta(String namaKereta) {
        this.namaKereta = namaKereta;
    }

    public String getGerbong() {
        return gerbong;
    }

    public void setGerbong(String gerbong) {
        this.gerbong = gerbong;
    }

    public String getKelas() {
        return kelas;
    }

    public void setKelas(String kelas) {
        this.kelas = kelas;
    }

    public String getJadwalBerangkat() {
        return jadwalBerangkat;
    }

    public void setJadwalBerangkat(String jadwalBerangkat) {
        this.jadwalBerangkat = jadwalBerangkat;
    }

    public String getJadwalTiba() {
        return jadwalTiba;
    }

    public void setJadwalTiba(String jadwalTiba) {
        this.jadwalTiba = jadwalTiba;
    }

    public String getStasiunAsal() {
        return stasiunAsal;
    }

    public void setStasiunAsal(String stasiunAsal) {
        this.stasiunAsal = stasiunAsal;
    }

    public String getStasiunTujuan() {
        return stasiunTujuan;
    }

    public void setStasiunTujuan(String stasiunTujuan) {
        this.stasiunTujuan = stasiunTujuan;
    }

    public ArrayList<Kereta> getKereta() {
        return kereta;
    }

    public void setKereta(ArrayList<Kereta> kereta) {
        this.kereta = kereta;
    }

    public void menampilkanInfoKereta(){
        System.out.println("Nama Kereta: " + getNamaKereta());
        System.out.println("Gerbong: "  + getGerbong());
        System.out.println("Kelas: " + getKelas());
        System.out.println("Jadwal Berangkat: " + getJadwalBerangkat());
        System.out.println("Jadwal Tiba: " + getJadwalTiba());
        System.out.println("Harga Tiket: " + getHargaTiket());
        System.out.println("Stasiun Asal: " + getStasiunAsal());
        System.out.println("Stasiun Tujuan: " + getStasiunTujuan());
    }
}
