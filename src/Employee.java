public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.hireYear = hireYear;
        this.salary = salary;
        this.workHours = workHours;
    }

    double tax() {
        if (this.salary <= 1000) {
            return 0;
        } else {
            return this.salary * 0.03;
        }


    }

    double bonus() {
        if (this.workHours <= 40) {
            return 0;
        } else {
            return (workHours - 40) * 30;
        }
    }

    double raiseSalary() {
        int labor = 2021 - hireYear;
        if (labor < 10) {
            return salary * 0.05;
        } else if (labor >= 10 && labor < 20) {
            return salary * 0.1;
        } else if (labor >= 20) {
            return salary * 0.15;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return
                "Adı: " + name +
                        "\nMaaşı: " + salary +
                        "\nÇalışma Saati: " + workHours +
                        "\nBaşlangıç Yılı: " + hireYear +
                        "\nVergi: " + tax() +
                        "\nBonus:  " + bonus() +
                        "\nMaaş Artışı: " + raiseSalary() +
                        "\nVergi ve Bonuslar ile birlikte maaş: " + ((salary + bonus()) - tax()) +
                        "\nToplam Maaş: " + (salary + raiseSalary());
    }
}

