# test_kotlin_sql

## Tutorial Setup

Setelah meng-clone repository ini, Anda mungkin menemukan beberapa file (misal file konfigurasi lokal atau file hasil build) tidak tercopy. Hal ini karena file tersebut diabaikan oleh `.gitignore` dan memang tidak disimpan di repository.

### Langkah-langkah Setup

1. **Pastikan semua file penting sudah di-commit**
   - Kode sumber, konfigurasi yang diperlukan, dan resource harus sudah ada di repository.

2. **Konfigurasi file lokal**
   - Untuk file konfigurasi lokal seperti `local.properties`, file ini biasanya tidak diikutkan ke repository.
   - Sebagai gantinya, tersedia file contoh: `local.properties.example`.
   - **Langkah manual:**  
     Salin `local.properties.example` menjadi `local.properties`, lalu sesuaikan isinya sesuai kebutuhan lokal Anda.

3. **Build Project**
   - Setelah clone dan konfigurasi file lokal, jalankan perintah berikut untuk membangun ulang file-file hasil build:
     ```
     ./gradlew build
     ```
     atau
     ```
     ./gradlew assemble
     ```

4. **Catatan**
   - Pastikan file yang dibutuhkan untuk membangun aplikasi sudah ada di repository.
   - File yang diabaikan oleh `.gitignore` bisa dibuat ulang atau dikonfigurasi manual setelah clone.

---

**Ringkasan:**  
- File penting harus ada di repository.  
- File konfigurasi lokal dibuat manual dari contoh.  
- File hasil build dibuat ulang dengan perintah build.

