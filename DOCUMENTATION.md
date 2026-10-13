DOKUMENTASI APLIKASI TASKMATE
Pemrograman Aplikasi Bergerak
Universitas Mulia
1. Deskripsi Aplikasi
TaskMate merupakan aplikasi manajemen tugas berbasis Android yang dirancang untuk membantu pengguna dalam membuat, mengatur, dan memantau aktivitas harian secara lebih terstruktur.
Aplikasi ini dikembangkan menggunakan bahasa pemrograman Kotlin dengan framework Jetpack Compose untuk menghasilkan tampilan antarmuka modern, responsif, dan mudah digunakan.
2. Tujuan Pengembangan
Tujuan pembuatan aplikasi TaskMate adalah:
1. Membantu pengguna mencatat daftar tugas yang harus dilakukan.
2. Mempermudah pengelolaan aktivitas berdasarkan prioritas.
3. Memberikan informasi detail mengenai setiap tugas.
4. Membantu pengguna memantau progres penyelesaian tugas.
3. Fitur Aplikasi
3.1 Dashboard Task
Halaman utama aplikasi yang menampilkan:
- Daftar tugas pengguna.
- Filter berdasarkan prioritas tugas.
- Informasi progres penyelesaian tugas.
- Daftar tugas yang akan datang.
Screenshot:
(Tempel gambar 01_Dashboard.png)
3.2 Add Task
Fitur untuk membuat tugas baru.
Informasi yang dapat ditambahkan:
- Judul tugas.
- Deskripsi tugas.
- Prioritas tugas.
Screenshot:
(Tempel gambar 02_Add_Task.png)
3.3 Detail Task
Menampilkan informasi lengkap dari tugas yang dipilih.
Informasi yang ditampilkan:
- Judul tugas.
- Deskripsi.
- Status tugas.
- Prioritas.
Screenshot:
(Tempel gambar 03_Detail_Task.png)
3.4 Edit Task
Fitur untuk memperbarui informasi tugas yang sudah dibuat.
Pengguna dapat mengubah:
- Judul tugas.
- Deskripsi.
- Prioritas.
Screenshot:
(Tempel gambar 04_Edit_Task.png)
4. Teknologi yang Digunakan
Aplikasi TaskMate dikembangkan menggunakan:
Teknologi	Keterangan
Kotlin	Bahasa pemrograman utama
Android Studio	IDE pengembangan aplikasi
Jetpack Compose	Framework UI modern Android
Material Design 3	Desain antarmuka
Room Database	Penyimpanan data lokal
MVVM Architecture	Struktur arsitektur aplikasi


5. Struktur Project
Struktur utama aplikasi:
TaskMate
│
├── app
│   └── src
│       └── main
│           ├── java
│           ├── res
│           └── AndroidManifest.xml
│
├── gradle
├── build.gradle.kts
└── settings.gradle.kts

6. Repository GitHub
Repository source code:
https://github.com/wisnuwardhana822/TaskMate-Android
Riwayat pengembangan dilakukan menggunakan Git dengan beberapa commit:
- Initial project TaskMate Android
- Add README documentation
- Add application screenshots
- Add application documentation
- Add development reflection
7. APK Aplikasi
File APK tersedia pada folder:
APK/
└── TaskMate.apk

APK dapat digunakan untuk instalasi langsung pada perangkat Android.
8. Video Demo
Video demonstrasi aplikasi tersedia pada folder:
Video Demo/
└── Screen_recording.mp4

Video berisi proses penggunaan aplikasi mulai dari:
- Membuka dashboard.
- Menambahkan tugas.
- Melihat detail tugas.
- Mengedit tugas.
9. Refleksi Pengembangan
Selama proses pengembangan aplikasi TaskMate terdapat beberapa keputusan desain yang dilakukan, yaitu penggunaan Jetpack Compose agar tampilan lebih modern dan penggunaan arsitektur MVVM agar kode lebih terstruktur.
Kendala yang ditemukan selama pengembangan adalah proses pengaturan database, navigasi antar halaman, serta penyempurnaan tampilan antarmuka.
Perbaikan berikutnya yang dapat dilakukan adalah menambahkan fitur notifikasi pengingat tugas, autentikasi pengguna, serta sinkronisasi data berbasis cloud.
