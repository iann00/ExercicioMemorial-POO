package com.company;

import com.company.models.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static final boolean isRunning =  true;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Memorial> memoriais = new ArrayList<>();
        boolean isLogged = false;

        criarMemoriaisFake(memoriais);

        while (isRunning) {
            System.out.println("*-------------------------------------------------------*");
            System.out.println("*                  Bem-vindo ao Memorial                *");
            System.out.println("*                                                       *");
            clear(5);

            System.out.println("* Com nosso sistema você poderá acessar o memorial de   *");
            System.out.println("*                                                       *");

            if (isLogged) {
                System.out.println("* Detectamos que você não está logado                            *");
                System.out.println("* deseja fazer login? (Y/n)                            *");

              

            }
            String qrCode = null;

            do {
                System.out.println("* Qual o QRCode do memorial?                            *");
                qrCode = scanner.next();
            } while (qrCode == null || qrCode.isEmpty());
        }
    }

    public static void criarMemoriaisFake(ArrayList<Memorial> memoriais) {
        Memorial memorial1 = new Memorial();
                 memorial1.setId(10000);

                 // Imagens
                 memorial1.setImagen(new Image("Foto 1"));
                 memorial1.setImagen(new Image("Foto 2"));

                 // Mensagens
                 memorial1.setMensagen(new Mensagem(1, "Msg 1"));
                 memorial1.setMensagen(new Mensagem(2, "Msg 2"));
                 memorial1.setMensagen(new Mensagem(3, "Msg 3"));
                 memorial1.setMensagen(new Mensagem(4, "Msg 4"));

                 Visita visit1 = new Visita();
                        visit1.setPublica(true);
                        visit1.setTimestamp(1554125372);

                Visita visit2 = new Visita();
                       visit2.setPublica(true);
                       visit2.setTimestamp(1548861032);

                Visita visit3 = new Visita();
                       visit3.setPublica(false);
                       visit3.setTimestamp(1547289901);

                 memorial1.setVisita(visit1);
                 memorial1.setVisita(visit2);
                 memorial1.setVisita(visit3);

        memoriais.add(memorial1);

    }

    public void buscaMemorial(String id) {
        ArrayList<Memorial> memoriais = new ArrayList<>();
    }

    private static boolean signin(String usuario, String senha) {
        ArrayList<Auth> auths = new ArrayList<>();
                        auths.add(new Auth("ivan01", "123"));

        for (Auth auth: auths) {
            if (auth.getUsuario().equals(usuario)
                && auth.getSenha().equals(senha)) {
                return true;
            }
        }

        return false;
    }

    public void criarMemorial() {
        System.out.println("* ----------------------------------------------------- *");
        System.out.println("*                   NOVO MEMORIAL                       *");
        System.out.println("*                                                       *");
        System.out.println("* Olá! Criar um memórial é muito fácil. Apenas nos dê   *");
        System.out.println("* algumas informações e pronto!                         *");
        System.out.println("*                                                       *");

        clear(5);
        System.out.println("*                                                       *");
    }

    private long getTimestamp() {
        return System.currentTimeMillis();
    }

    public static void clear(int amount) {
        for (int i = 0; i < amount; i++) {
            System.out.println("*                                                       *");
        }
    }
}
