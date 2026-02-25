//Miguel Ulla Moreno
//uvus:KHG4236
//pass:425

package us.dit;

public class Control {

    public static void main(String[] args) {
        System.out.println(sumarDigitos(12345));
    }

    public static int sumarDigitos(int num) {
        int suma = 0;
        while (num > 0) {
            suma += num % 10;
            num /= 10;
        }
        return suma;
    }
}