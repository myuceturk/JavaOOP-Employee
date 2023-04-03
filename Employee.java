package OOP.Employee;

public class Employee {
    String name;
    double salary;
    byte workHours;
    short hireYear;

    Employee(String name, double salary, byte workHours, short hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax() {
        if (this.salary >= 1000)
            return this.salary * 0.03;
        else
            return this.salary;
    }

    public double bonus() {
        double bonusFee = 0.0;
        if (this.workHours > 40) {
            bonusFee = (this.workHours - 40) * 30;
            return bonusFee;
        }
        return 0;
    }

    public double raiseSalary() {
        if ((2023 - this.hireYear) < 10) {
            return this.salary * 0.05;
        } else if ((2023 - this.hireYear) > 9 && (2023 - this.hireYear) < 20) {
            return this.salary * 0.10;
        } else
            return this.salary * 0.15;
    }

    public double total() {
        return this.salary + raiseSalary();
    }

    public double totalFees() {
        return this.salary + bonus() - tax();
    }


    public void employeeInfo() {
        System.out.println("====== Çalışan Bilgileri ======");
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma Saati: " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("--------------------------");
        System.out.println("Vergi: " + tax());
        System.out.println("Bonus: " + bonus());
        System.out.println("Maaş Artışı: " + raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: " + totalFees());
        System.out.println("Toplam: " + total());
    }

}
