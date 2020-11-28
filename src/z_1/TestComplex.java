package z_1;

import java.util.Scanner;

public class TestComplex {
    public static Complex getComplexInvalid() {
        try {
            final ComplexAbstractFactory factory = new ConcreteFactory();
            final Scanner sc =  new Scanner(System.in);
            return factory.createComplex(sc.nextInt(), sc.nextInt());
        }
        catch (Exception e) {
            System.out.println("Ошибка, попробуйте снова.");
            return getComplexInvalid();
        }
    }
    public static void main(String[] args) {
        Complex[] complexes = new Complex[2];
        for(int i=1; i<=complexes.length; i++) {
            System.out.println("Введите реальную и мнимую часть "+i+" комплексного числа");
            complexes[i-1] = getComplexInvalid();
        }
        System.out.println(complexes[0]);
        System.out.println(complexes[1]);
        System.out.println("Сумма двух комплексных чисел");
        System.out.println(complexes[0] + " + " + complexes[1] + " = " + complexes[0].addComplex(complexes[1]));
        System.out.println("Разность двух комплексных чисел");
        System.out.println(complexes[0] + " - " + complexes[1] + " = " + complexes[0].subComplex(complexes[1]));
        System.out.println("Произведение двух комплексных чисел");
        System.out.println(complexes[0] + " * " + complexes[1] + " = " + complexes[0].multiComplex(complexes[1]));
        System.out.println("Частное двух комплексных чисел");
        System.out.println(complexes[0] + " / " + complexes[1] + " = " + complexes[0].divisionComplex(complexes[1]));
    }
}