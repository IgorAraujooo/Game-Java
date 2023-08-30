package br.senai.sp.jandira.game.Model;

public class Player {
    public String name;
    public String skin;
    private int life;

    public Player(){
        life = 100;
    }

    public int GetLife(){
        return life;
    }

    public void SubtrairVida(int danoEnemy){

        life -= danoEnemy;

        if (life < 0){
            life = 0;
        }
    }

    public void RestartLife(){
        life = 100;
    }



}
