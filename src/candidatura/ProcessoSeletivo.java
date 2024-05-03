package candidatura;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(5000);

        String [] candidatos ={"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

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
}
