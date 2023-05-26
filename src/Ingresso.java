import java.util.Scanner;

public class Ingresso {
    
    private int cadeiras1[][]=new int [6][10];
    private int cadeiras2[][]=new int [6][10];
    private int cadeiras3[][]=new int [6][10];
    private int cadeiras4[][]=new int [6][10];
    private int cadeiras5[][]=new int [6][10];
    
    
    public Ingresso(){
    }

    public void LugaresVagos(){
            Horarios();;
            Scanner scanner = new Scanner(System.in);
            int horaio = scanner.nextInt();

            switch (horaio) {
                case 1:
                    TestaLugares(cadeiras1);
                    break;
                case 2:
                    TestaLugares(cadeiras2);
                    break;
                case 3:
                    TestaLugares(cadeiras3);
                    break;
                case 4:
                    TestaLugares(cadeiras4);
                    break;
                case 5:
                    TestaLugares(cadeiras5);
                    break;

                default:
                    System.out.println("Informe um valor valido");
                    break;
            }

    }
    public void ComprarIngresso(){
            Horarios();
        Scanner scanner = new Scanner(System.in);
        int horario = scanner.nextInt();
        switch (horario) {
            case 1:
            BuyTickets(cadeiras1);
                break;
            case 2:
            BuyTickets(cadeiras2);
            
                break;
            case 3:
            BuyTickets(cadeiras3);
                break;
            case 4:
            BuyTickets(cadeiras4);
                break;
            case 5:
            BuyTickets(cadeiras5);
                break;
            default:
            System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                System.out.println("Informe uma cadeira valida");
                break;
        }
    }
    public void BemVIndo(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Bem vindo ao CineMonlevade, como podemos ajuda-lo?");
        Opcoes();
    }
    public void Opcoes(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        System.out.println("Para ver as sessões disponiveis, digite 6 ");
            System.out.println("Para comprar os ingressos, digite 7 ");
            System.out.println("Para finalizar o atendimento, digite 0");
    }
    public void Horarios(){
        System.out.println("Informe qual horario você deseja:");
            System.out.println("Horario 1 : 13:30");
            System.out.println("Horario 2 : 15:30");
            System.out.println("Horario 3 : 17:30");
            System.out.println("Horario 4 : 19:30");
            System.out.println("Horario 5 : 21:30");
    }
    private void TestaLugares(int Vetor[][]){
        System.out.println("Temos essas cadeiras disponiveis para a sessão de 13:30:");
        for(int i=0; i<6 ;i++){
            for(int j=0;j<10;j++){
                
                if (Vetor[i][j]==0) {
                    System.out.println("A cadeira " + i + j +" está livre");
                }else{
                    System.out.println("A cadeira " + i + j + " está ocupada");
                }
            }

        }
    }
    private void BuyTickets(int Vetor[][]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe qual coluna você deseja comprar:");
            int i = scanner.nextInt();
            System.out.println("Informe a fileira: ");
            int j = scanner.nextInt();
            if(Vetor[i][j] == 0){
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("Muito obrigado por comprar com o CineMonlevade, o ingresso custa um total de R$ 10,00");

                    Vetor[i][j] = 1;
            }else{
                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
                    System.out.println("A cadeira que voce deseja não está disponivel");
         
            }
    }
}