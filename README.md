# Struktur-Data-A Stack & Queue
## Stack
Stack atau dalam Bahasa Indonesia diartikan tumpukan, adalah struktur data linier yang mengikuti prinsip Last In First Out (LIFO). Artinya elemen yang terakhir disisipkan akan menjadi elemen pertama yang keluar.
Cara struktur data stack dalam menyimpan sebuah nilai dapat kita bayangkan seperti piring yang disusun rapi secara bertumpuk ke atas. Apabila kita ingin mengambil piring bagian bawah, kita harus terlebih dahulu menyisihkan semua piring yang ada di atas.
Dalam istilah pemrograman, upaya menambahkan elemen pada struktur data stack disebut dengan push. Sedangkan proses menghapus atau menghilangkan elemen data dari stack disebut pop. 
![image](https://user-images.githubusercontent.com/114170254/208702814-cfc51e40-ea5a-490c-8fa1-34a9198b0f4d.png)

Dari gambar di atas, dapat terlihat bahwa meskipun elemen ke-3 adalah yang paling terakhir ditambahkan, namun elemen tersebut justru yang pertama dihapus. Operasi inilah yang kemudian disebut sebagai prinsip operasi LIFO (Last In First Out). Selain Push dan Pop ada beberapa operasi pada stack yang penting untuk di perhatikan, antara lain yaitu
- peek : mencari elemen yang berada di paling atas (yang terakhir dimasukkan), namun tidak dikeluarkan.
- empty : mengecek apakah stack tersebut kosong atau tidak.
- full : mengecek apakah stack tersebut penuh atau tidak (jika dimasukkan berakibat overflow).

dalam struktur data stack ada dua kondisi yang perlu dihindari, yaitu underflow dan overflow.
- Stack underflow, yaitu keadaan dimana kita mencoba mengakses atau menghapus elemen data pada stack yang kosong.
- Stack overflow, yaitu keadaan di mana ruang memori yang dialokasikan untuk struktur data stack sudah penuh namun masih dilakukan operasi penyisipan elemen.

### Deklarasi stack dalam program
Sebuah stack di dalam program komputer dideklarasikan sebagai sebuah tipe bentukan baru. Sebuah struktur data dari sebuah stack setidaknya harus
mengandung dua buah variabel, yakni variabel TOP yang akan berguna sebagai penanda bagian atas tumpukan dan array data dari yang akan menyimpan data-data yang dimasukkan ke dalam stack tersebut.

### Fungsi dan Kegunaan Stack
Adapun fungsi dan kegunaan struktur data stack adalah sebagai berikut:
- Struktur data stack digunakan dalam evaluasi dan konversi ekspresi aritmatika. Proses ini banyak dipakai untuk program kompiler.
- Stack digunakan dalam pemrograman rekursi.
- Digunakan untuk pemeriksaan tanda kurung.
- Stack digunakan dalam manajemen memori.
- Dipakai untuk memproses pemanggilan sebuah fungsi.

## Queue
Queue atau dalam Bahasa Indonesia diartikan antrian adalah kumpulan data yang penambahan elemennya hanya bisa dilakukan pada sisi belakang dan penghapusannya hanya bisa dilakukan pada sisi depan. Konsep utamanya berkebalikan dari stack Prinsipnya adalah Elemen yang pertama kali masuk ke antrian akan keluar pertama kali. Atau dikenal dengan sebutan yaitu First In First Out.
![image](https://user-images.githubusercontent.com/114170254/208706990-6a36ec0b-7aea-4330-883d-beb3d11f6a95.png)

Pada gambar di atas, karena elemen 1 ditambahkan ke antrian lebih dulu daripada 2, maka 1 adalah elemen yang pertama dihapus dari antrian. Hal ini mengikuti aturan operasi FIFO. Dalam istilah pemrograman, menempatkan item dalam struktur data queue disebut enqueue, sedangkan operasi menghapus item dari queue disebut dequeue.

### Operasi-operasi dasar dalam queue
- Create: Operasi untuk menciptakan dan menginisialisasi Queue
- Enqueue: Operasi untuk menambah elemen baru pada bagian belakang antrian
- Dequeue: Operasi menghapus elemen satu per satu pada bagian depan antrian
- Clear: Operasi untuk mengosongkan antrian. (Menghapus seluruh elemen dalam antrian).
- Tampil : Operasi untuk menampilkan elemen dari antrian satu demi satu
- IsEmpty: Operasi untuk mengecek apakah antrian dalam kondisi kosong atau tidak.
- IsFull: Operasi untuk mengecek apakah antrian dalam kondisi penuh atau tidak.

### Deklarasi queue dalam program
Sebuah queue di dalam program komputer dideklarasikan sebagai sebuah tipe bentukan baru. Sebuah struktur data dari sebuah queue setidaknya
harus mengandung dua atau tiga variabel, yakni variabel HEAD yang akan berguna sebagai penanda bagian depan antrian, variabel TAIL yang akan berguna sebagai penanda bagian belakang antrian dan ARRAY DATA dari yang akan menyimpan data-data yang dimasukkan ke dalam queue tersebut.

### Fungsi dan Kegunaan Queue
Berikut ini adalah beberapa fungsi queue yang paling umum dalam struktur data:
- Queue banyak digunakan untuk menangani lalu lintas (traffic) situs web.
- Membantu untuk mempertahankan playlist yang ada pada aplikasi media player
- Queue digunakan dalam sistem operasi untuk menangani interupsi.
- Membantu dalam melayani permintaan pada satu sumber daya bersama, seperti printer, penjadwalan tugas CPU, dll.
- Digunakan dalam transfer data asinkronus misal pipeline, IO file, dan socket.



