Nama: Ferdian Wahyu Nabillah
NIM: (09040623059)

Mengapa Studi Kasus Ini Layak Diselesaikan dengan Abstraksi dan Interface:

1.Fleksibilitas dan Ekstensi:
Dengan menggunakan kelas abstrak Vehicle dan interface Maintenance,
sistem ini sangat fleksibel dan mudah diperluas. Jika ada jenis kendaraan baru yang perlu ditambahkan,
kita hanya perlu membuat kelas baru yang mewarisi Vehicle dan mengimplementasikan Maintenance.

2.Keterpisahan Tanggung Jawab:
Abstraksi memungkinkan pemisahan tanggung jawab dengan mendefinisikan atribut dan metode umum di kelas abstrak Vehicle,
sementara implementasi spesifik ditangani oleh kelas-kelas turunan seperti Car, Motorcycle, dan Truck.

3.Konsistensi dengan Pola Desain: 
Interface Maintenance memastikan bahwa semua kelas yang mewakili kendaraan harus mengimplementasikan metode perawatan, 
sehingga sistem dapat dijaga konsistensinya dan dipaksa mengikuti kontrak yang sama.

4.Polimorfisme: 
Menggunakan abstraksi dan interface memungkinkan penggunaan polimorfisme secara efektif, 
sehingga kita bisa menggunakan tipe Vehicle atau Maintenance secara umum tanpa peduli dengan implementasi spesifiknya, 
yang meningkatkan modularitas dan keterbacaan kode.

Dengan pendekatan ini, sistem manajemen kendaraan dapat dikembangkan secara efisien, dikelola dengan baik, dan mudah dipelihara di masa depan.
