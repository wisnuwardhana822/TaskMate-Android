\# Dokumentasi TaskMate Android



\## Deskripsi Aplikasi



TaskMate merupakan aplikasi manajemen tugas berbasis Android yang membantu pengguna dalam membuat, mengatur, dan memantau aktivitas harian secara lebih terstruktur.



Aplikasi ini dikembangkan menggunakan Kotlin dengan Jetpack Compose untuk menghasilkan tampilan modern dan responsif.



\## Arsitektur Aplikasi



TaskMate menggunakan pendekatan MVVM (Model View ViewModel).



\### Model

Berfungsi mengelola data tugas menggunakan Room Database.



\### View

Menggunakan Jetpack Compose untuk membangun antarmuka pengguna.



\### ViewModel

Mengatur logika aplikasi dan komunikasi antara UI dengan database.



\## Database



Aplikasi menggunakan Room Database sebagai penyimpanan data lokal.



Data yang disimpan:

\- Judul tugas

\- Deskripsi tugas

\- Prioritas tugas

\- Status penyelesaian tugas



\## Alur Aplikasi



1\. Pengguna membuka Dashboard.

2\. Pengguna dapat melihat daftar tugas.

3\. Pengguna dapat menambahkan tugas baru.

4\. Pengguna dapat melihat detail tugas.

5\. Pengguna dapat mengedit informasi tugas.



\## Teknologi



\- Kotlin

\- Android Studio

\- Jetpack Compose

\- Material Design 3

\- Room Database

\- MVVM Architecture

