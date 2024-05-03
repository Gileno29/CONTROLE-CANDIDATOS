package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
public class ProcessoSeletivo {
    public static void main(String[] args) {
        /*analisarCandidato(1900);
        analisarCandidato(2000);
        analisarCandidato(5000);*/

        //selecaoCandidatos();
        imprimirSelecionados();


      
    }





    static void entrandoEmContato(String candidato){
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu= false;

        do{

           atendeu= atender();
           continuarTentando= !atendeu;

           if(continuarTentando){
             tentativasRealizadas ++;

           }else{
             System.out.println("CONTATO REALIZADO COM SUCESSO");
           }
            

        }while (continuarTentando && tentativasRealizadas < 3);



        if (atendeu)
            System.out.println("CONSEGUIMOS CONTATO COM "+ candidato + "Na" + tentativasRealizadas);

        else
            System.out.println("NAO CONSEGUIMOS CONTATO COM " + candidato + " NUMERO MAXIMO DE TENTATIVAS");

        }
    



    static boolean atender(){
        return new Random().nextInt(3)==1;
    }



    static void imprimirSelecionados(){
        String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};

        System.out.println("Imprimindo a lista: " + candidatos);
        for (int indice=0; indice < candidatos.length;indice++){
            System.out.println("O candidato de n° "+ (indice+1) + " é "+ candidatos[indice]);
            entrandoEmContato(candidatos[indice]);
        }
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
