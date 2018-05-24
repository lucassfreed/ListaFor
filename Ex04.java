public class Ex04 {

    public static void main(String[] args) {

        String texto = "";

        for (int linha = 0; linha < 20; linha++) {
            for (int coluna = 0; coluna < 20; coluna++) {

                if (linha == 0 || linha == 20 || coluna == 0 || coluna == 20) {
                    texto += "* ";
                } else if (linha == coluna) {
                    texto += "                                    *";
                } 
                
                if (linha == 19) {
                    texto += "* ";
                }



            }
            texto += "\n";

        }
        System.out.print (texto);

    }
}