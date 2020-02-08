/*
2. Анализ конвертов
Есть два конверта со сторонами (a,b) и (c,d) определить, можно ли один конверт вложить в другой.
Программа должна обрабатывать ввод чисел с плавающей точкой.
Программа спрашивает у пользователя размеры конвертов по одному параметру за раз.
После каждого подсчёта программа спрашивает у пользователя хочет ли он продолжить.
Если пользователь ответит “y” или “yes” (без учёта регистра),
программа продолжает работу сначала, в противном случае – завершает выполнение.
 */
package softserve.academy;

import java.util.Scanner;

public class Envelope2 {
    private double env1SideA; // side а of envelope 1
    private double env1SideB; // side b of envelope 1
    private double env2SideC; // side c of envelope 2
    private double env2SideD; // side d of envelope 2

    // constructor creates envelopes with sides
    private Envelope2() {
        double number;
        boolean err;
        do {
            err = false;
            System.out.print("Enter side а of envelope 1: ");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextDouble()) {
                number = scan.nextDouble();
                if (number > 0) {
                    env1SideA = number;
                } else {
                    System.out.println("You entered a negative number or zero, try again");
                    err = true;
                }
            } else {
                System.out.println("You entered not a number, try again");
                err = true;
            }
        } while (err);
        do {
            err = false;
            System.out.print("Enter side b of envelope 1: ");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextDouble()) {
                number = scan.nextDouble();
                if (number > 0) {
                    env1SideB = number;
                } else {
                    System.out.println("You entered a negative number or zero, try again");
                    err = true;
                }
            } else {
                System.out.println("You entered not a number, try again");
                err = true;
            }
        } while (err);
        do {
            err = false;
            System.out.print("Enter side c of envelope 2: ");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextDouble()) {
                number = scan.nextDouble();
                if (number > 0) {
                    env2SideC = number;
                } else {
                    System.out.println("You entered a negative number or zero, try again");
                    err = true;
                }
            } else {
                System.out.println("You entered not a number, try again");
                err = true;
            }
        } while (err);
        do {
            err = false;
            System.out.print("Enter side d of envelope 2: ");
            Scanner scan = new Scanner(System.in);
            if(scan.hasNextDouble()) {
                number = scan.nextDouble();
                if (number > 0) {
                    env2SideD = number;
                } else {
                    System.out.println("You entered a negative number or zero, try again");
                    err = true;
                }
            } else {
                System.out.println("You entered not a number, try again");
                err = true;
            }
        } while (err);
    }

    // the method of comparing the sides of envelopes
    private void matchEnv() {
        if (((env1SideA > env2SideC) && (env1SideB > env2SideD))
                || ((env1SideA > env2SideD) && (env1SideB > env2SideC))) {
            System.out.println("Second envelope can put into first one");
        } else if (((env1SideA < env2SideC) && (env1SideB < env2SideD))
                || ((env1SideA < env2SideD) && (env1SideB < env2SideC))) {
            System.out.println("First envelope can put into second one");
        } else {
            System.out.println("Envelopes cannot be put into each other");
        }
    }

    public static void main(String[] args) {
        String answerU;
        do {
            Envelope2 env = new Envelope2();
            env.matchEnv();
            System.out.println("Do you want to continue? (y/n or yes/no): ");
            Scanner scan = new Scanner(System.in);
            answerU = scan.nextLine();
        }
        // the method lexically compares two lines ignoring letter case
        while (answerU.compareToIgnoreCase("y") == 0 || answerU.compareToIgnoreCase("yes") == 0);
    }
}
