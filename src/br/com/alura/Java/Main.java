package br.com.alura.Java;

public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Mavertick");

        //comentario
        /*

        comentario
        comentario

        */

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double noraDoFilme = 8.1;

        double media = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(media);
        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura com galã dos anos 80
                Muito bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (media / 2);
        System.out.println(classificacao);
        /*
        DE / PARA :	byte	short	char	int	    long    float	 double
        byte    	---     Impl.	(char)	Impl.	Impl.	 Impl.   Impl.
        short	    (byte)	---     (char)	Impl.	Impl.	 Impl.	 Impl.
        char	    (byte)	(char) 	---	    Impl.	Impl.	 Impl.	 Impl.
        int	        (byte)	(char)	(char)   ---	Impl.	 Impl.	 Impl.
        long	    (byte)	(char)	(char)	(int)	--- 	 Impl.	 Impl.
        float	    (byte)	(char)	(char)	(int)	(long) 	  --- 	 Impl.
        double	    (byte)	(char)	(char)	(int)	(long)	(float)	  ---
         */

    }
}
