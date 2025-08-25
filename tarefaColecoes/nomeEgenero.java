import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class nomeEgenero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite os nomes e sexos no formato 'nome-sexo' (separados por vírgula):");
        System.out.println("Exemplo: Maria-F,João-M,Ana-F");
        
        String input = scanner.nextLine();
        
        String[] entradas = input.split(",");
        
        List<String> feminino = new ArrayList<>();
        List<String> masculino = new ArrayList<>();
        
        for (String entrada : entradas) {
            String[] partes = entrada.split("-");
            
            if (partes.length == 2) {
                String nome = partes[0].trim();
                String sexo = partes[1].trim().toUpperCase();
                
                if (sexo.equals("F")) {
                    feminino.add(nome);
                } else if (sexo.equals("M")) {
                    masculino.add(nome);
                }
            }
        }
        
        System.out.println("\n--- Grupo Feminino ---");
        for (String nome : feminino) {
            System.out.println(nome);
        }
        
        System.out.println("\n--- Grupo Masculino ---");
        for (String nome : masculino) {
            System.out.println(nome);
        }
        
        scanner.close();
    }
}