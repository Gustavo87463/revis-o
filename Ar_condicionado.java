package Teste;

public class Ar_condicionado {

    private String modelo;
    private int temperatura;
    private int velocidade;
    private boolean estaLigado;
    private boolean estaOcilando;
    private int timer;

    public Ar_condicionado(){}

    


    public Ar_condicionado(String modelo, int temperatura) {
        this.modelo = modelo;
        this.temperatura = temperatura;
    }



    //metodo construtor
    public Ar_condicionado(String modelo, int temperatura, int velocidade, boolean estaLigado, boolean estaOcilando,
            int timer) {
        this.modelo = modelo;
        this.temperatura = temperatura;
        this.velocidade = velocidade;
        this.estaLigado = estaLigado;
        this.estaOcilando = estaOcilando;
        this.timer = timer;
    }

    public void ligar(){ //metodo para ligar o ar

    }

    public void desligar(){ // metodo para desligar o ar

    }

    public void aumentarTemperatura(){ // metodo para aumentar a temperatura
        temperatura = temperatura +1;

    }

    public void diminuirTemperatura(){ // metodo para diminuir a temperatura
        temperatura = temperatura -2;
        
    }

    public void ligarOcilação(){ // metodo para ligar a ocilação
        estaOcilando = true;
    }

    public void desligarOcilacao(){ // metodo para desligar a ocilação
        estaOcilando = false;
    }

    public void ligarTimer(int tempo){ // metodo para ligar o timer
        timer =  tempo;
    }


    //metodo get para retornar 
    public String getModelo(){
        return modelo;
        
    }

    //metodo set para atualizar uma variavel
    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    

  

    
}
