import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account misCuentas = new Account(0, 0, 0, 0, 0);
        Income misIngresos = new Income(0, 0, 0, 0, 0);
        Bills misBills = new Bills(0, 0, 0, 0);
        Saving misAhorros = new Saving(0, 0, 0);
        DebtPayment misDeudas = new DebtPayment(0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
        Expenses misGastos = new Expenses(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

        Scanner scanner = new Scanner(System.in);

        System.out.println("WHERE IS MY MONEY");
        System.out.println("Bienvenida Merita!");
        System.out.println("================================");
        System.out.println("Ingresa tus saldos actuales:");
        System.out.println("--------------------------------");

        System.out.println("Bancolombia Ahorros:");
        double saldo1 = scanner.nextDouble();
        misCuentas.setBankAccount1(saldo1);

        System.out.println("Bancolombia Corriente:");
        double saldo2 = scanner.nextDouble();
        misCuentas.setBankAccount2(saldo2);

        System.out.println("Nequi:");
        double saldo3 = scanner.nextDouble();
        misCuentas.setBankAccount3(saldo3);

        System.out.println("Otra cuenta:");
        double saldo4 = scanner.nextDouble();
        misCuentas.setBankAccount4(saldo4);

        System.out.println("Efectivo:");
        double saldo5 = scanner.nextDouble();
        misCuentas.setCash(saldo5);

        System.out.println("================================");
        System.out.println("RESUMEN DE CUENTAS:");
        System.out.println("Bancolombia Ahorros: $" + misCuentas.getBankAccount1());
        System.out.println("Bancolombia Corriente: $" + misCuentas.getBankAccount2());
        System.out.println("Nequi: $" + misCuentas.getBankAccount3());
        System.out.println("Otra cuenta: $" + misCuentas.getBankAccount4());
        System.out.println("Efectivo: $" + misCuentas.getCash());

        double totalDisponible = misCuentas.getBankAccount1() + misCuentas.getBankAccount2() 
                               + misCuentas.getBankAccount3() + misCuentas.getBankAccount4() 
                               + misCuentas.getCash();
        System.out.println("================================");
        System.out.println("TOTAL DISPONIBLE: $" + totalDisponible);

        scanner.close();
    }
}