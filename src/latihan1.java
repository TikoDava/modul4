import java.lang.Math;
import java.util.Scanner;
public class latihan1 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("Pilih operasi:");
                System.out.println("1. Akar Kuadrat");
                System.out.println("2. Pangkat");
                System.out.println("3. Logaritma Natural");
                System.out.println("4. Factorial");
                System.out.println("5. Keluar");

                int pilihan = scanner.nextInt();

                if (pilihan == 5) {
                    System.out.println("Terima kasih!");
                    break;
                }

                double hasil = 0;

                switch (pilihan) {
                    case 1:
                        System.out.print("Masukkan angka: ");
                        double angkaAkar = scanner.nextDouble();
                        hasil = Math.sqrt(angkaAkar);
                        break;
                    case 2:
                        System.out.print("Masukkan angka: ");
                        double angkaPangkat = scanner.nextDouble();
                        System.out.print("Masukkan pangkat: ");
                        double pangkat = scanner.nextDouble();
                        hasil = Math.pow(angkaPangkat, pangkat);
                        break;
                    case 3:
                        System.out.print("Masukkan angka: ");
                        double angkaLog = scanner.nextDouble();
                        hasil = Math.log(angkaLog);
                        break;
                    case 4:
                        System.out.print("Masukkan angka: ");
                        int angkaFactorial = scanner.nextInt();
                        hasil = factorial(angkaFactorial);
                        break;
                    default:
                        System.out.println("Pilihan tidak valid");
                        continue;
                }

                System.out.println("Hasil: " + hasil);
            }

            scanner.close();
        }

        private static double factorial(int n) {
            if (n == 0 || n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
    }


