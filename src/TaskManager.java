import java.util.ArrayList;
import java.util.List;

/**
 * Mengelola daftar tugas.
 */
public class TaskManager {
    private List<Task> tasks; // Daftar tugas

    /**
     * Membuat TaskManager baru.
     */
    public TaskManager() {
        tasks = new ArrayList<>(); // Inisialisasi daftar tugas
    }

    /**
     * Menambahkan tugas baru ke dalam daftar.
     *
     * @param title Judul dari tugas yang akan ditambahkan.
     */
    public void addTask(String title) {
        tasks.add(new Task(title)); // Menambahkan tugas baru ke daftar
    }

    /**
     * Menandai tugas sebagai selesai berdasarkan indeksnya.
     *
     * @param index Indeks dari tugas yang akan diselesaikan.
     */
    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete(); // Menandai tugas sebagai selesai
        } else {
            System.out.println("Indeks tugas tidak valid."); // Pesan kesalahan jika indeks tidak valid
        }
    }

    /**
     * Menampilkan semua tugas dalam daftar.
     */
    public void displayTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i)); // Menampilkan setiap tugas dengan indeksnya
        }
    }
}