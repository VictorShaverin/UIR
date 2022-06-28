import java.util.Scanner;

public class Main {
    public static void main(java.lang.String[] args) {
        Scanner scanner = new Scanner(System.in);
        double R = 8.31;
        System.out.println("I=");
        double I = scanner.nextInt();
        System.out.println("Q=");
        double Q = scanner.nextInt();
        System.out.println("T=");
        double T = scanner.nextInt();
        double Q1 = theamoutofheat(I, R, T);
        System.out.println(Q1);
        double I1 = power(Q, R, T);
        System.out.println(I1);
        double R1 = resist(Q, I, T);
        System.out.println(R1);
        double T1 = tempereture(Q, I, R);
        System.out.println(T1);
    }

    /**
     * Вычислние количество теплоты
     *
     * @param I сила тока ,А
     * @param R сопротивление
     * @param T температура ,К
     * @return Возращает значение количества теплоты
     */
    public static double theamoutofheat(double I, double R, double T) {
        return I * I * R * T;
    }

    /**
     * Вычисление силы тока
     *
     * @param Q количество теплоты ,Дж
     * @param R сопротивление ,
     * @param T температура ,К
     * @return Возращает значение силы тока
     */
    public static double power(double Q, double R, double T) {
        return Math.sqrt(Q / (R * T));
    }

    /**
     * Вычисление сопротивления
     *
     * @param Q количество теплоты  ,Дж
     * @param I сила тока ,А
     * @param T температура ,К
     * @return Возращает значение сопротивления
     */
    public static double resist(double Q, double I, double T) {
        return Q / (I * I * T);
    }

    /**
     * Вычисление температуры
     *
     * @param Q количество теплоты  ,Дж
     * @param I сила тока ,А
     * @param R сопротивление ,
     * @return Возращает значение температуры
     */
    public static double tempereture(double Q, double I, double R) {
        return Q / (I * I * R);
    }
}