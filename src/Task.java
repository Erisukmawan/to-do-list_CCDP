/**
 * Mewakili sebuah tugas dalam daftar to-do.
 */
public class Task {
    private String title; // Judul tugas
    private boolean isCompleted; // Status penyelesaian tugas

    /**
     * Membuat tugas baru dengan judul yang ditentukan.
     *
     * @param title Judul dari tugas.
     */
    public Task(String title) {
        this.title = title;
        this.isCompleted = false; // Tugas belum selesai saat dibuat
    }

    /**
     * Menandai tugas sebagai selesai.
     */
    public void complete() {
        isCompleted = true; // Mengubah status tugas menjadi selesai
    }

    /**
     * Mengembalikan judul dari tugas.
     *
     * @return Judul dari tugas.
     */
    public String getTitle() {
        return title; // Mengembalikan judul tugas
    }

    /**
     * Memeriksa apakah tugas sudah selesai.
     *
     * @return true jika tugas sudah selesai, false jika belum.
     */
    public boolean isCompleted() {
        return isCompleted; // Mengembalikan status penyelesaian tugas
    }

    @Override
    public String toString() {
        return (isCompleted ? "[X] " : "[ ] ") + title; // Mengembalikan representasi string dari tugas
    }
}