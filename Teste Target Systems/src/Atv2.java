public class Atv2 {
    public static void main(String[] args) throws Exception {
        
        String palavra = "Target Sistemas";

        int contador = 0;

        for (int i = 0; i < palavra.length(); i++) {
            
            if (palavra.charAt(i) == 'a' || palavra.charAt(i) == 'A') {
                contador++;
            }
        }

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes nessa palavra.");
        } else {

            System.out.println("A letra 'a' não aparece nessa palavra.");
        }
    
    }
}
