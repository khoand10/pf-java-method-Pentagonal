import java.util.Scanner;

public class Pentagonal {
    public static int getPentagonalNumber(int a){
        return a*(3*a-1)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you number :");
        int a = sc.nextInt();
        System.out.println(getPentagonalNumber(a));
    }
}
