
import java.util.Stack;

public class Stack1 {
  public static void main(String[] args) {
    // deklarasi objek stack kotor
    Stack kotor = new Stack();
    
    // deklarasi objek stack bersih
    Stack bersih = new Stack();
    
    // perulangan for
    for (int i = 1; i <= 5; i++)
    {
      // proses memasukkan data pada stack
      kotor.push("piring " + i);
    }
    
    // menampilkan jumlah piring kotor
    System.out.println("SEBELUM DICUCI" + "\nJumlah piring kotor : " + kotor.size() + "\nJumlah piring bersih : "
        + bersih.size() + "\nTumpukan piring kotor :"); 

    for (int i = 1; i <= 5; i++)
    {

      // proses pengeluaran data pada stack
      System.out.println(kotor.peek());
      bersih.push(kotor.pop());
    }
    
    // menampilkan jumlah piring bersih dan piring yang telah dicuci
    System.out.println("\nSETELAH DICUCI" + "\nJumlah piring kotor : " + kotor.size() + "\nJumlah piring bersih : "
        + bersih.size() + "\nTumpukan piring bersih :");
    for (int i = 4; i >= 0; i--) {
      System.out.println(bersih.elementAt(i));
    }
  }
}
