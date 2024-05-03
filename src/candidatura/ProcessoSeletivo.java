package candidatura;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        /*analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(5000);*/

        selecaoCandidatos();
      
    }


    static void selecaoCandidatos(){
        String [] candidatos ={"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
        int candidatosSelecionados =0;
        int candidatoAtual=0;
        double salarioBase=2000.0;

        while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato=candidatos[candidatoAtual];
            double salarioPretendido = valorPrtendido();

            System.out.println("O candidato " +  candidato + " Solicitou este valor de salario " + salarioPretendido );

            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga" );
                candidatosSelecionados++;

            }
            candidatoAtual++;
        }
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido){
            
            System.out.println("Ligar para o Candidato");

        }else if(salarioBase==salarioPretendido){
            
            System.out.println("Ligar para o candidato com contra proposta");
       
        }else{
            System.out.println("aguardando resultado dos demais candidatos ");
        }
    }

    static Double valorPrtendido(){
        return ThreadLocalRandom.current().nextDouble(100, 2200);
    }

}
