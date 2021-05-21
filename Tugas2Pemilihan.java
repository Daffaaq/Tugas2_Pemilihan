import java.util.Scanner;
public class Tugas2Pemilihan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("+=====================================+");
		System.out.println("|       Program Nilai Mahasiswa       |");
		System.out.println("+=====================================+");
		System.out.println("|    Komponen      |  Bobot Nilai     |");
		System.out.println("|      UAS         |       40%        |");
		System.out.println("|      UTS         |       30%        |");
		System.out.println("|     Kuis         |       10%        |");
		System.out.println("|     Tugas        |       20%        |");
		System.out.println("+=====================================+");
		System.out.println("+=====================================+");
		System.out.print("Masukkan Nama Anda: ");
		String nama = input.nextLine();
		System.out.print("Masukkan Nilai UAS  : ");
		int uas = input.nextInt();
		System.out.print("Masukkan Nilai UTS  : ");
		int uts = input.nextInt();
		System.out.print("Masukkan Nilai Kuis : ");
		int kuis = input.nextInt();
		System.out.print("Masukkan Nilai Tugas: ");
		int tugas = input.nextInt();
		System.out.println("+=====================================+");
		double temp1 = uas * 0.4;
		double temp2 = uts * 0.3;
		double temp3 = kuis * 0.1;
		double temp4 = tugas * 0.2;
		double temp5 = temp1 + temp2 + temp3 + temp4;
		if (temp5 >= 65){
			System.out.println("Nama: " + nama);
			System.out.println("Nilai Akhir: " +(int)temp5);
			System.out.println("Anda dinyatakan Lulus!");
		} else if(temp5 > 0 && temp5 < 65){
			System.out.println("Nama: " + nama);
			System.out.println("Nilai Akhir: " +(int)temp5);
			System.out.println("Anda mendapatkan Remidi!");
		} else{
			System.out.println("Nama: " + nama);
			System.out.println("Nilai Akhir: " +(int)temp5);
			System.out.println("Nilai Anda tidak cocok!");
		}
	}
}