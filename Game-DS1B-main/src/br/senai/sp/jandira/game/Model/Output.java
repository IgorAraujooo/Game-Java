    package br.senai.sp.jandira.game.Model;

    public class Output {
        public void PrintPlayer(Player player){
            System.out.println("-------------------------------------");
            System.out.println("O nome do Player é: " +  player.name);
            System.out.println("A skin do Player é: " + player.skin);
            System.out.println("A life do Player é: " + player.GetLife());
        }

        public void PrintEnemy(Enemy enemy){
            System.out.println("-------------------------------------");
            System.out.println("O nome do Inimigo é: " + enemy.name);
            System.out.println("A skin do Inimigo é: " + enemy.skin);
            System.out.println("A life do Inimigo é: " + enemy.GetLife());
        }
    }
