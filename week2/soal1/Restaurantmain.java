public class Restaurantmain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        menu.tambahMenuMakanan("Pizza", 250000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Spaghetti", 80000, 20);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30);
        Restaurant.nextId();
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);

        System.out.println("=== Menu Awal ===");
        menu.tampilMenuMakanan();

        System.out.println("\n=== Proses Pemesanan ===");
        menu.pesanMenuMakanan("Pizza", 5); // Berhasil
        menu.pesanMenuMakanan("Spaghetti", 25); // Ditolak karena stok kurang

        System.out.println("\n=== Menu Setelah Pemesanan ===");
        menu.tampilMenuMakanan();
    }
}
