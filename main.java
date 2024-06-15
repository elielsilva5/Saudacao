import java.time.LocalDateTime;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;
import java.lang.*;


public class Main {

     public static void main (String [] args){

        String nome = "Eliel";

        // ISO 8601 --> padrão de datas

        LocalDate hoje = LocalDate.now();
        //String diaSemana;
        Locale brasil = new Locale("pt","BR");
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if (agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia!";}
            else if (agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde!";}
            else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite!";}
            else{
            saudacao = "Olá.";}
        System.out.printf("Olá, %s. Hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }

}