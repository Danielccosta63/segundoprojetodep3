package segundoProjetoDeP3;

import java.util.Scanner;

public class Input {
	static Scanner scan = new Scanner(System.in);
    private static Scanner scanner;

    public Input(){}
    
    

    public static int lerInteiro() {
        boolean ready = false;
        int valor = -1;
        while (!ready) {
            try {
                valor = new Input().getInstance().nextInt();
                ready = true;
            } catch (Exception e) {
                new Input().getInstance().next();
                System.out.println("Erro ao ler valor informado! Tente novamente");
                ready = false;
            }
        }
        return valor;
    }

    public static Double lerDouble() {
        boolean ready = false;
        Double valor = -1.0;
        while (!ready) {
            try {
                valor = new Input().getInstance().nextDouble();
                ready = true;
            } catch (Exception e) {
                new Input().getInstance().next();
                System.out.println("Erro ao ler valor informado! Tente novamente");
                ready = false;
            }
        }
        return valor;
    }

    public static String lerString() {
        boolean ready = false;
        String valor = "";
        while (!ready) {
            try {
                valor = new Input().getInstance().next();
                ready = true;
            } catch (Exception e) {
                new Input().getInstance().next();
                System.out.println("Erro ao ler valor informado! Tente novamente");
                ready = false;
            }
        }
        return valor;
    }

    public static String lerLinha() {
        boolean ready = false;
        String valor = "";
        while (!ready) {
            try {
                valor = new Input().getInstance().nextLine();
                
                ready = true;
            } catch (Exception e) {
                new Input().getInstance().next();
                System.out.println("Erro ao ler valor informado! Tente novamente");
                ready = false;
            }
        }
        return valor;
    }

    private Scanner getInstance() {
        if (scanner == null)
            scanner = new Scanner(System.in);
        return scanner;
    }


}