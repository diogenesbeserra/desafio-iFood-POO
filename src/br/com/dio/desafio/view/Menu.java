package br.com.dio.desafio.view;

import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Dev;

import java.util.Iterator;
import java.util.Scanner;

public class Menu {
    static boolean inicio = true;
    static boolean devs = true;
    static Bootcamp bootcamp = null;

    static Scanner teclado = new Scanner(System.in);

    public static void inicio(Bootcamp bootcamp1) {
        Menu.bootcamp = bootcamp1;
        while (inicio) {
            System.out.println("\nMenu inicial");
            System.out.println("1 - Devs");
            System.out.println("2 - Bootcamps");

            System.out.println("Entre x para sair: ");

            String opcao = teclado.nextLine();
            switch (opcao) {
                case "x":
                    inicio = false;
                    devs = false;
                    break;
                case "1":
                    devs = true;
                    devs();
//                    inicio = false;
                    break;
            }
        }
    }

    private static void devs() {
        while (devs) {
            System.out.println("\nMenu Devs");
            System.out.println("1 - Listar Devs");
            System.out.println("2 - Cadastrar Dev");
            System.out.println("3 - Remover Dev");
            System.out.println("4 - Voltar");

            String opcao = teclado.nextLine();
            switch (opcao) {
                case "1":
                    listarDev();
                    continue;
                case "2":
                    Dev dev1 = new Dev();
                    System.out.println("Digite o nome do novo Dev: ");
                    dev1.setNome(teclado.nextLine());
                    dev1.inscreverBootcamp(bootcamp);
                    System.out.println("\nDev cadastrado com sucesso\n");
                    listarDev();
                    continue;
                case "3":
                    System.out.println("Digite o nome do Dev a ser removido: ");
                    String removerDev = teclado.nextLine();

                    for (Iterator<Dev> it = bootcamp.getDevsInscritos().iterator(); it.hasNext(); ) {
                        Dev dev = it.next();
                        if (dev.getNome().equals(removerDev)) {
                            bootcamp.getDevsInscritos().remove(dev);
                            System.out.println("\nRemovido com sucesso\n");
                            break;
                        }
                        if (!it.hasNext()) {
                            System.out.println("\nNão encontrado\n");
                        }
                    }
                    listarDev();
                    continue;
                case "4":
                    devs = false;
                    inicio(bootcamp);
                    break;
            }
        }
    }

    public static void listarDev() {
        for (Iterator<Dev> it = bootcamp.getDevsInscritos().iterator(); it.hasNext(); ) {
            Dev dev = it.next();
            System.out.println(dev.toString());
        }
        System.out.println("");
    }
}
