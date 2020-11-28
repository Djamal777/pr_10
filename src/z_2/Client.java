package z_2;

import java.util.Scanner;

public class Client {
    public Chair chair;
    public void sit(){
        if(chair instanceof MagicChair) {
            ((MagicChair) chair).doMagic();
            System.out.println("Произошла магия");
        }
        else if(chair instanceof  VictorianChair) {
            System.out.println("Этому стулу " + ((VictorianChair) chair).getAge()+" лет");
        }
        else if(chair instanceof FunctionalChair) {
            int a = 0, b = 0, sum = 0;
            boolean isDone = false;
            while (!isDone) {
                try {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Введите a и b: ");
                    a = sc.nextInt();
                    b = sc.nextInt();
                    sum = ((FunctionalChair) chair).sum(a, b);
                    isDone = true;
                }
                catch (Exception e) {
                    System.out.println("Ошибка, попробуйте еще раз.");
                }
            }
            System.out.println("Ввод: " + a + " и " + b);
            System.out.println("Вывод: " + sum);
        }
    }
    public void setChair(Chair chair) {
        this.chair = chair;
    }
}