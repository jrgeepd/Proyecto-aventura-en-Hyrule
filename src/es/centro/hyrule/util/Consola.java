package es.centro.hyrule.util;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Consola {
    private static final Scanner scanner = new Scanner(System.in);

    public static String LeerTexto(String mensaje) {
        String str;
        do {
            System.out.println(mensaje);
            str = scanner.nextLine();
        } while (str == null);
        return str;
    }

    public static int LeerEntero(String mensaje, int min, int max){
        int num;
        do {
            System.out.println(mensaje);
            num = scanner.nextInt();
        } while (!scanner.hasNextInt() && !(num >= min && num <= max));
        return num;
    }

    public static double LeerDecimal(String mensaje, double min, double max){
        double num;
        do {
            System.out.println(mensaje);
            num = scanner.nextDouble();
        } while (!scanner.hasNextDouble() && !(num >= min && num <= max));
        return num;
    }

    public static LocalDate leerFecha(String mensaje) {
        String fechaStr;
        String[] fechaArr;
        int diasEnMes;
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        do {
            System.out.println(mensaje);
            fechaStr = scanner.nextLine();
            fechaArr = fechaStr.split("/");
            diasEnMes = YearMonth.of(Integer.parseInt(fechaArr[2]), Integer.parseInt(fechaArr[1])).lengthOfMonth();
        } while (!fechaStr.matches("(0[1-9]|[12]\\d|3[01])/(0[1-9]|1[0-2])/(\\d{4})") || diasEnMes < Integer.parseInt(fechaArr[0]));
        return LocalDate.parse(fechaStr, formato);
    }
}
