import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        show();
    }

    static void show() {
        System.out.println("------Chuyen Nhiet Do------");
        System.out.println("1.Fahrenheit to Celsius");
        System.out.println("2.Celsius to Fahrenheit");
        System.out.println("3.Exit");
        System.out.print("Enter a number : ");
        switch ((int) nhap()) {
            case 1:
                System.out.print("Nhap do F = ");
                System.out.println("F->C : "+fromFtoC());
                break;
            case 2:
                System.out.print("Nhap do C = ");
                System.out.println("C->F : "+fromCtoF());
                break;
            case 3:
                break;
            default:
                System.out.println("Nhap lai !!!");
                show();
        }
    }

    static float nhap() {
        Scanner scanner = new Scanner(System.in);
        float n = scanner.nextFloat();
        return n;
    }

    static float fromCtoF() {
        float templateC = nhap();
        float templateF = (float) (templateC / (5.0 / 9) + 32);
        return templateF;
    }

    static float fromFtoC() {
        float templateF = nhap();
        float templateC = (float) ((5.0 / 9) * (templateF - 32));
        return templateC;
    }
}
