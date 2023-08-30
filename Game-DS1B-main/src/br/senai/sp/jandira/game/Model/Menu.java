package br.senai.sp.jandira.game.Model;

import javax.imageio.spi.RegisterableService;
import java.util.Scanner;

public class Menu {

    /**
     * Instancia o Scanner
     */
    Scanner teclado = new Scanner(System.in);

    /**
     * Instancia Register
     */
    Register register = new Register();

    /** Instancia Battle  */
    Battle battle = new Battle();


    public void Menu() {

        boolean continuar = true;

        while (continuar) {

            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
            System.out.println("------------    Bem Vindo    --------------");
            System.out.println("Escolha uma opção: ");
            System.out.println("[1- Register  2- Battle  3- Exit]");
            System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

            int userOption = teclado.nextInt();

            switch (userOption) {
                case 1:
                    register.Decision();
                    break;

                case 2:
                    battle.ChoiceScenario();
                    battle.Battle(register.player, register.enemy);
                    register.player.RestartLife();
                    register.enemy.RestartLife();
                    break;

                case 3:
                    continuar = false;
                    break;
            }

        }
    }

}
