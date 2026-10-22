import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int jenis,durasi=0, total=0;

        System.out.println("Masukkan jenis kendaraan : ");
        jenis=sc.nextInt();

        do {
            if (jenis==1) {
                System.out.println("Masukkan durasi :");
                durasi=sc.nextInt();
                total+=durasi*3250;
                System.out.println("Total : "+total);
            } else if (jenis==2) {
                System.out.println("Masukkan durasi :");
                durasi=sc.nextInt();
                total+=durasi*2250;
                System.out.println("Total : "+total);
            }
            
        } while (jenis!=0);
        System.out.println("Progam berakhir");
    }
}
