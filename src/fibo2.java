import java.util.Scanner;
public class fibo2 {
    static int fib (int n){
        if (n ==1 || n == 2){
            return 1;
    } return fib(n-1) + fib(n -2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.println("Kontrol etmek istedğiniz sayıyi giriniz: ");
        a= input.nextInt();
        System.out.println(fib(a));
    }
}
