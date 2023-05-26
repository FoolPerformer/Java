import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // voce foi contratado para desenvolver um software responsavel pela gestao da sala de cinema do hiper de joão monlevade. Para isso voce deve implementar um sistema computacional responsavel por 5 sessoes diarias, na qual cada uma das cadeiras da saal de cinema deverá ser gerida. Desenvolva a solução para tal problema. Obs: Considere 5 sessões diarias para um total de 60 poltornas organizadas em 6 colunas e 20 fileiras 
        Scanner scanner = new Scanner(System.in);
        Ingresso i = new Ingresso();
        i.BemVIndo();;
        
        int comando = scanner.nextInt();
        
        do{
        if(comando == 6){
            i.LugaresVagos();
            i.Opcoes();
            comando = scanner.nextInt();
            
        }
        else if(comando == 7){
            i.ComprarIngresso();
            i.Opcoes();
            comando = scanner.nextInt();
        }
    }while(comando!=0);
    System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    System.out.println("Obrigado por ter vindo ao CineMonlvade");
    }
}
