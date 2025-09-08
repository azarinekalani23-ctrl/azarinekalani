import java.util.Scanner;
public class minimarket{
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    int operatorpertama, operatorkedua;
    int penjumlahan, pengurangan, perkalian;
    double pembagian;
    System.out.print("Operator pertama");
    operatorpertama = sc.nextInt();
    System.out.print("Ope kedua");
    operatorkedua = sc.nextInt();

    //Hitungan 
    penjumlahan = operatorpertama + operatorkedua;
    pengurangan = operatorpertama - operatorkedua;
    perkalian = operatorpertama * operatorkedua;
    pembagian = (double) operatorpertama / operatorkedua;

    System.out.println("Hasil penjumlahan : " + penjumlahan);
    System.out.println("Hasil pengurangan : " + pengurangan);
    System.out.println("Hasil perkalian : " + perkalian);
    System.out.println("Hasil pembagian : " + pembagian);
}
}
