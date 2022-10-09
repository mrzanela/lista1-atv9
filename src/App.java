import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Faça um Programa que peça a temperatura em graus Fahrenheit
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a temperatura em F°: ");
        double tempF = sc.nextDouble();
        sc.close();
        //transforme e mostre a temperatura em graus Celsius. C = 5 * ((F-32) / 9).
        double celsius = 5*((tempF-32)/9);
        System.out.println("A temperatura em Fahrenheit é "+tempF+", convertida para Celsius ela é "+celsius);
    }
}
