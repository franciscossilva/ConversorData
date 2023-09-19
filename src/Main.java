import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor interiro para conversao: ");
        long valorInteiro = scanner.nextLong();
        scanner.close();
        Date data = new Date(valorInteiro);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
        String dataFormatada = sdf.format(data);
        System.out.println("Data formatada : "+ dataFormatada);
    }
}