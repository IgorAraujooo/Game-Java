package br.senai.sp.jandira.game.Model;

import java.util.Scanner;

public class Battle {

    String scenarioBattle;

    /** Instancia Scanner */
    Scanner teclado = new Scanner(System.in);

    /** Instancia Scenario */
    Scenario scenario = new Scenario();

     public void ChoiceScenario(){

         System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");
         System.out.println("Escolha um Cenario: ");
         System.out.println("1- Arabia  2- Grecia  3- Los Angeles");
         System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

         int userScenario = teclado.nextInt();

         scenarioBattle = scenario.Scenario(userScenario);

         System.out.println(scenarioBattle);

     }


     public void Battle(Player player, Enemy enemy){

         while (true) {


             int lifePlayer = player.GetLife();
             int lifeEnemy = enemy.GetLife();

             if (lifePlayer == 0) {
                 System.out.println("O Vencedor é o Enemy " + enemy.name);
                 break;
             } else if (lifeEnemy == 0) {
                 System.out.println("O Vencedor é o Player " + player.name);
                 break;
             }


             System.out.println("---------------------------- Battle ---------------------------");
             System.out.println(" Ataque Player [ R ] - " + player.name + " life: " + lifePlayer);
             System.out.println(" Ataque Enemy  [ Q ] - " + enemy.name + " life: "+ lifeEnemy);
             System.out.println("---------------------------------------------------------------");

             String attack = teclado.next();

             if (attack.equalsIgnoreCase("R")) {

                 System.out.println("------------------------------------");
                 System.out.println("-           Player Atacou          -");
                 System.out.println("------------------------------------");

                 int danoPlayer = (int) (Math.random() * 20) + 1;
                 int defesaEnemy = (int) (Math.random() * 20) + 1;

                 int chanceDefesa = (int) (Math.random() * 5) + 1;
                 int danoReal;

                 System.out.println("Digite um numero para defesa [1-5]");

                 int numberDefesa = teclado.nextInt();

                 if(numberDefesa == chanceDefesa){
                     danoReal = danoPlayer - defesaEnemy;
                 }else{
                     danoReal = danoPlayer;
                 }

                 if (danoReal < 0){
                     danoReal = 0;
                 }

                 enemy.SubtrairVida(danoReal);

                 enemy.SubtrairVida(danoPlayer);

                 System.out.println("-----------------------------------");
                 System.out.println("O ataque foi de: " + danoPlayer);
                 System.out.println("-----------------------------------");


             } else if (attack.equalsIgnoreCase("Q")) {

                 System.out.println("------------------------------------");
                 System.out.println("-           Enemy Atacou          -");
                 System.out.println("------------------------------------");

                 int danoPlayer = (int) (Math.random() * 20) + 1;
                 int defesaEnemy = (int) (Math.random() * 20) + 1;
                 int chanceDefesa = (int) (Math.random() * 5) + 1;

                 int danoReal;

                 System.out.println("Digite um numero para defesa [1-5]");

                 int numberDefesa = teclado.nextInt();

                 if(numberDefesa == chanceDefesa){
                     danoReal = danoPlayer - defesaEnemy;
                 }else{
                     danoReal = danoPlayer;
                 }

                 if (danoReal < 0){
                     danoReal = 0;
                 }

                 player.SubtrairVida(danoReal);

                 System.out.println("-----------------------------------");
                 System.out.println("O ataque foi de: " + danoPlayer);
                 System.out.println("-----------------------------------");


             } else {
                 System.out.println("Tecla Invalida !!!!");
             }


         }

     }




}
