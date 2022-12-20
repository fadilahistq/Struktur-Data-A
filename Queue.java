import java.util.Scanner;
import java.util.InputMismatchException;

public class Queue {
  // buat dua variabel. Variabel pertama adalah Integer Array dengan panjang 5
  // dengan nama queue, dan yang kedua adalah variabel Integer dengan nama
  // variabel counters dan dengan nilai awal = 0.
  private static int[] queue = new int[5];
  private static int counters = 0;

  // buat sebuah return value method untuk memeriksa tingkat keterisian antrian
  // yang mana akan mengembalikan nilai TRUE jika masih terdapat tempat dalam
  // antrian, dan memberikan nilai FALSE jika antrian sudah penuh.
  private static boolean queueStorage() {
    if (counters < queue.length) {
      return true;
    } else {
      return false;
    }
  }

  // buat sebuah method void untuk melakukan aksi Enqueue
  private static void createQueue() {
    int loopX = 0;
    int alpha = 0;
    while (loopX == 0) {
      System.out.print("Masukkan Data (angka): ");
      Scanner alphaX = new Scanner(System.in);
      try {
        alpha = alphaX.nextInt();
        loopX = 1;
      } catch (InputMismatchException e) {
        System.out.println("Masukan harus berupa Angka!");
        loopX = 0;
      }
    }
    queue[counters] = alpha;
    counters++;
  }

  // buat sebuah method void untuk melakukan aksi Dequeue
  private static void removeQueue() {
    counters--;
    for (int i = 0; i < counters; i++) {
      queue[i] = queue[i + 1];
    }
    System.out.println("Data pertama dalam queue sudah dikeluarkan");
  }

  // untuk dapat membuktikan bahwa queue bekerja dengan baik, maka tambahkan
  // satu method lagi untuk menampilkan nilai – nilai dalam queue.
  private static void displayDataQueue() {
    System.out.print("Data dalam Queue: ");
    for (int i = 0; i < counters; i++) {
      System.out.print(" [" + i + " => " + queue[i] + "]");
    }
    System.out.println("");
  }

  // buat juga satu method untuk menghapus seluruh antrian
  private static void cleanQueue() {
    counters = 0;
  }

  // Selanjutnya, buat menu untuk program ini.
  // tambahkan satu method lagi untuk menampilkan menu.
  private static void menuProgram() {
    int loopX = 0;
    int choosenMenu = 0;
    while (loopX == 0) {
      System.out.println("\nContoh Program Queue dengan Java");
      System.out.println("Menu: ");
      System.out.println("1. Tambah Queue");
      System.out.println("2. Keluarkan 1 data dari Queue");
      System.out.println("3. Status Queue");
      System.out.println("4. Tampilkan data dalam Queue");
      System.out.println("5. Bersihkan Queue");
      System.out.println("6. Keluar dari Program");
      System.out.print("Pilihan Menu (1 - 6) >>> ");
      Scanner menuOption = new Scanner(System.in);
      try {
        choosenMenu = menuOption.nextInt();
        loopX = 1;
      } catch (InputMismatchException e) {
        System.out.println("Masukan harus Angka!");
      }
    }
    System.out.println("");
    menuChooser(choosenMenu);
  }

  // Untuk menghandle item menu yang dipilih, buat satu method lagi.
  private static void menuChooser(int choosenMenu) {
    switch (choosenMenu) {
      case 1:
        boolean check = queueStorage();
        if (check) {
          createQueue();
        } else {
          System.out.println("Antrian Penuh!, kosongkan data satu terlebih dahulu!");
        }
        break;
      case 2:
        removeQueue();
        break;
      case 3:
        System.out.println("Status Storage: ");
        System.out.println("Kapasitas: " + queue.length);
        System.out.println("Terisi   : " + counters);
        break;
      case 4:
        displayDataQueue();
        break;
      case 5:
        cleanQueue();
        break;
      case 6:
        quitApp();
        break;
    }
    menuProgram();
  }

  // Karena disini kita menawarkan fungsi exit dari program, maka tambahkan satu
  // method untuk men-terminate program
  private static void quitApp() {
    String quitss = "y";
    System.out.print("Keluar dari Program? (Y/T): ");
    quitss = new Scanner(System.in).nextLine();
    if (quitss.equalsIgnoreCase("y")) {
      System.exit(0);
    } else {
      menuProgram();
    }
  }

  public static void main(String[] args) {
    menuProgram();
  }
}
