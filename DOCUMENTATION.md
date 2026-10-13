
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
\# Dokumentasi Aplikasi TaskMate
(Improve documentation format)


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

<<<<<<< HEAD
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
=======
\## Pemrograman Aplikasi Bergerak

\### Universitas Mulia



\---



\# 1. Deskripsi Aplikasi
>>>>>>> 5a7b819 (Improve documentation format)

APK dapat digunakan untuk instalasi langsung pada perangkat Android.
8. Video Demo
Video demonstrasi aplikasi tersedia pada folder:
Video Demo/
└── Screen_recording.mp4

<<<<<<< HEAD
Video berisi proses penggunaan aplikasi mulai dari:
- Membuka dashboard.
- Menambahkan tugas.
- Melihat detail tugas.
- Mengedit tugas.
9. Refleksi Pengembangan
Selama proses pengembangan aplikasi TaskMate terdapat beberapa keputusan desain yang dilakukan, yaitu penggunaan Jetpack Compose agar tampilan lebih modern dan penggunaan arsitektur MVVM agar kode lebih terstruktur.
Kendala yang ditemukan selama pengembangan adalah proses pengaturan database, navigasi antar halaman, serta penyempurnaan tampilan antarmuka.
Perbaikan berikutnya yang dapat dilakukan adalah menambahkan fitur notifikasi pengingat tugas, autentikasi pengguna, serta sinkronisasi data berbasis cloud.
=======

TaskMate merupakan aplikasi manajemen tugas berbasis Android yang membantu pengguna dalam membuat, mengatur, dan memantau aktivitas harian secara lebih terstruktur.



Aplikasi ini dikembangkan menggunakan bahasa pemrograman Kotlin dengan framework Jetpack Compose untuk menghasilkan tampilan antarmuka yang modern, responsif, dan mudah digunakan.



\---



\# 2. Tujuan Pengembangan



Tujuan pembuatan aplikasi TaskMate yaitu:



1\. Membantu pengguna mencatat daftar tugas yang harus dilakukan.

2\. Mempermudah pengelolaan aktivitas berdasarkan tingkat prioritas.

3\. Memberikan informasi detail mengenai setiap tugas.

4\. Membantu pengguna memantau progres penyelesaian tugas.



\---



\# 3. Fitur Aplikasi



\## 3.1 Dashboard Task



Dashboard merupakan halaman utama aplikasi yang menampilkan daftar tugas pengguna.



Fitur yang tersedia:



\- Daftar tugas pengguna.

\- Filter berdasarkan prioritas.

\- Informasi progres penyelesaian tugas.

\- Daftar tugas yang akan datang.



Screenshot:



!\[Dashboard](screenshots/01\_Dashboard.png)



\---



\## 3.2 Add Task



Fitur Add Task digunakan untuk membuat tugas baru.



Informasi yang dapat ditambahkan:



\- Judul tugas.

\- Deskripsi tugas.

\- Prioritas tugas.



Screenshot:



!\[Add Task](screenshots/02\_Add\_Task.png)



\---



\## 3.3 Detail Task



Halaman Detail Task menampilkan informasi lengkap mengenai tugas yang dipilih.



Informasi yang ditampilkan:



\- Judul tugas.

\- Deskripsi tugas.

\- Status tugas.

\- Prioritas tugas.



Screenshot:



!\[Detail Task](screenshots/03\_Detail\_Task.png)



\---



\## 3.4 Edit Task



Fitur Edit Task digunakan untuk memperbarui informasi tugas yang telah dibuat.



Pengguna dapat mengubah:



\- Judul tugas.

\- Deskripsi tugas.

\- Prioritas tugas.



Screenshot:



!\[Edit Task](screenshots/04\_Edit\_Task.png)



\---



\# 4. Teknologi yang Digunakan



| Teknologi | Keterangan |

|---|---|

| Kotlin | Bahasa pemrograman utama |

| Android Studio | IDE pengembangan aplikasi |

| Jetpack Compose | Framework UI modern Android |

| Material Design 3 | Sistem desain antarmuka |

| Room Database | Penyimpanan data lokal |

| MVVM Architecture | Struktur arsitektur aplikasi |



\---



\# 5. Struktur Project



Struktur utama project:

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





\---



\# 6. Repository GitHub



Repository source code:



https://github.com/wisnuwardhana822/TaskMate-Android





Riwayat commit:



\- Initial project TaskMate Android

\- Add README documentation

\- Add application screenshots

\- Update README

\- Add application documentation

\- Add development reflection



\---



\# 7. APK Aplikasi



File APK tersedia pada folder:

APK/

└── TaskMate.apk





APK dapat digunakan untuk instalasi aplikasi secara langsung pada perangkat Android.



\---



\# 8. Video Demo



Video demonstrasi aplikasi berisi:



\- Membuka dashboard aplikasi.

\- Menambahkan tugas baru.

\- Melihat detail tugas.

\- Mengedit tugas.



Link video demo:



(Tambahkan link Google Drive di sini)



\---



\# 9. Refleksi Pengembangan



Dalam pengembangan aplikasi TaskMate digunakan Jetpack Compose untuk menghasilkan tampilan modern serta arsitektur MVVM agar struktur kode lebih terorganisir.



Kendala selama pengembangan meliputi pengaturan navigasi antar halaman, pengelolaan database lokal, serta penyempurnaan tampilan antarmuka.



Pengembangan selanjutnya dapat menambahkan fitur notifikasi pengingat tugas, autentikasi pengguna, serta sinkronisasi data berbasis cloud.

>>>>>>> 5a7b819 (Improve documentation format)
