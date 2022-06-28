package Teste;

public class Principal {

    public static void main(String[] args) {
        
        //Ar_condicionado obj = new Ar_condicionado("um que funcione", 18, 1, true, false, 0);
        Ar_condicionado obj = new Ar_condicionado("um que funcione", 18);

        System.out.println("modelo do ar condicionado: " + obj.getModelo());//retornando 
        obj.setModelo("LG");//alterando o objeto
        System.out.println("modelo do ar condicionado: " + obj.getModelo());//retornando 
    }   

    
}
