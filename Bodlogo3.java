import java.util.Scanner;

class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public RaiseResult calculateRaise() {
        int percent;

        if (salary >= 0 && salary <= 400.00)
            percent = 15;
        else if (salary <= 800.00)
            percent = 12;
        else if (salary <= 1200.00)
            percent = 10;
        else if (salary <= 2000.00)
            percent = 7;
        else
            percent = 4;

        double bonus = salary * percent / 100;
        double newSalary = salary + bonus;

        return new RaiseResult(newSalary, bonus, percent);
    }
}

class RaiseResult {
    public double newSalary;
    public double bonus;
    public int percent;

    public RaiseResult(double newSalary, double bonus, int percent) {
        this.newSalary = newSalary;
        this.bonus = bonus;
        this.percent = percent;
    }
}

public class Bodlogo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inputSalary = scanner.nextDouble();

        Employee emp = new Employee(inputSalary);
        RaiseResult result = emp.calculateRaise();

        System.out.printf("Novo salario: %.2f\n", result.newSalary);
        System.out.printf("Reajuste ganho: %.2f\n", result.bonus);
        System.out.printf("Em percentual: %d %%\n", result.percent);
    }
}
