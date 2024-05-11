public class CaixaEletronico {
    public static void main(String[] args) {
        
        double saldo = 25.0;
        double valorSolicatado = 22.0;

        if(valorSolicatado < saldo){  

        saldo = saldo - valorSolicatado;
        System.out.println("Novo saldo: " + saldo);
        }
        else
        System.out.println("Saldo insuficiente");

      

    }
}
