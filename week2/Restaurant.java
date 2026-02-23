public class Restaurant {
   
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        this.nama_makanan[id] = nama;
        this.harga_makanan[id] = harga;
        setStok(id, stok); 
    }

   
    public void setStok(int id, int stok) {
        if (stok >= 0) { 
            this.stok[id] = stok;
        } else {
            System.out.println("Gagal: Stok tidak boleh negatif!");
        }
    }

    public int getStok(int id) {
        return this.stok[id];
    }

    public String getNamaMakanan(int id) {
        return this.nama_makanan[id];
    }

   
    public void pesanMenuMakanan(String nama, int jumlah) {
        for (int i = 0; i <= id; i++) {
            if (nama.equalsIgnoreCase(nama_makanan[i])) {
                if (stok[i] >= jumlah) {
                     
                    stok[i] -= jumlah;
                    System.out.println("Berhasil memesan " + jumlah + " " + nama);
                } else {
                   
                    System.out.println("Maaf, stok " + nama + " tidak mencukupi!");
                }
                return;
            }
        }
        System.out.println("Menu " + nama + " tidak ditemukan.");
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i <= id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]\tRp. " + harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }

    public static void nextId() {
        id++;
    }
}
