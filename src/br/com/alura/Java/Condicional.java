package br.com.alura.Java;

public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 2022;
        boolean inclidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "plus";


        if (anoDeLancamento>2022){
            System.out.println("Lançamento que os clientes estão curtindo!");
        }
        else {
            System.out.println("Filme retrô que vale a pena assistir");
        }

        // para comparativo de String sempre usar o parametro .equals
        if(inclidoNoPlano == true || tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        }else {
            System.out.println("Deve pagar a localção");
        }
    }
}
