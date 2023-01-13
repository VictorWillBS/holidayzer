import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Holydaizer holydays = new Holydaizer();
        Scanner sc = new Scanner(System.in);
        int response = 0;

        while(response!=1||response!=2){
            System.out.println(response);
            System.out.println("Olá, digite o número da sua opção:");
            System.out.println("1: Verificar se uma data é um feriado.");
            System.out.println("2: Conferir todos feriados de 2023.");
            System.out.println("3: Sair.");
            response = sc.nextInt();
            if(response == 3){
                System.out.println("Espero tê-lo ajudado :)");
                return;
            }
            else if(response==1||response==2){
                break;
            }else{
                System.out.println("Desculpe, não entendi.");

            }
        }

        if(response==1){
            System.out.println("Insira a data no formato dd/mm/aaaa :");
            String date =sc.next();
            String holydayOrNot = holydays.getHolyday(date);
            System.out.println("Data " + date + " é: " + holydayOrNot);
        }else if(response==2){
            Map<String,String> allHolidays = holydays.getAllHolydays();
            for(Map.Entry<String,String> entrada :allHolidays.entrySet() ){
                System.out.println(entrada);
            }
        }
        sc.close();
    }
}