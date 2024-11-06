import java.util.Scanner;

/**
 * Kelas utama untuk menjalankan aplikasi To Do List.
 */
public class Main {
    /**
     * Titik masuk dari aplikasi.
     *
     * @param args Argumen baris perintah (tidak digunakan).
     */
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager(); // Membuat instance TaskManager
        Scanner scanner = new Scanner(System.in); // Scanner untuk input pengguna
        String command; // Variabel untuk menyimpan perintah pengguna

        System.out.println("Selamat datang di aplikasi To Do List!");

        do {
            System.out.println("\nPerintah yang tersedia: add, complete, display, exit");
            System.out.print("Masukkan perintah: ");
            command = scanner.nextLine(); // Membaca perintah dari pengguna

            switch (command) {
                case "add":
                    System.out.print("Masukkan judul tugas: ");
                    String title = scanner.nextLine(); // Membaca judul tugas dari pengguna
                    taskManager.addTask(title); // Menambahkan tugas baru
                    break;
                case "complete":
                    System.out.print("Masukkan indeks tugas untuk diselesaikan: ");
                    int index = scanner.nextInt(); // Membaca indeks tugas
                    scanner.nextLine(); // Mengonsumsi newline
                    taskManager.completeTask(index); // Menandai tugas sebagai selesai
                    break;
                case "display":
                    taskManager.displayTasks(); // Menampilkan semua tugas
                    break;
                case "exit":
                    System.out.println("Keluar dari aplikasi."); // Pesan keluar
                    break;
                default:
                    System.out.println("Perintah tidak dikenal. Silakan coba lagi."); // Pesan kesalahan
                    break;
            }
        } while (!command.equals("exit")); // Loop sampai pengguna memasukkan 'exit'

        scanner.close(); // Menutup scanner
    }
}