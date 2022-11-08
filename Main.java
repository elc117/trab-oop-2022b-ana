import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("\tPrograma de ajuda aos animais. Escolha uma opcao abaixo: ");
        System.out.println("0. Sair.");
        System.out.println("1. Descobrir se uma marca machuca os animais.");
        System.out.println("2. Ver biblioteca de livros.");
        System.out.println("3. Recomendar um livro.");
        System.out.println("4. Adotar um PET.");
    }

   public static void sair(){
        System.out.println("Obrigado por usar o programa.");
    }
  
    public static void pesquisaMarca(){
        System.out.println("Qual o nome da marca?");
    }
    
    public static void exibeBiblioteca(){
        System.out.println("Estes sao os livros sobre animais disponiveis na biblioteca ");
  
      
 System.out.println("Biblioteca de livros: ");
    
    }
    
    public static void recebeRecomendacao(){
        System.out.println("Qual livro voce gostaria de recomendar para a biblioteca?");
    }
    
    public static void adotaPet(){
        System.out.println("Qual tipo de animal voce gostaria de adotar?");
    }
    
    public static void main(String[] args) {
        int opcao;
          ArrayList<Livro> booklist = new ArrayList<Livro>();
    Livro l1 = new Livro("Animal Liberation");
    Livro l2 = new Livro("Vegetable Kingdom");
    booklist.add(l1);
    booklist.add(l2);
       for (int i = 0; i < booklist.size(); i++) {
      System.out.println(booklist.get(i).nome);
    }
   
   
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 0:
                sair();
                break;

            case 1:
                pesquisaMarca();
                break;
                
            case 2:
                exibeBiblioteca();
                break;
                
            case 3:
                recebeRecomendacao();
                break;
                
            case 4:
                adotaPet();
                break;
            
            default:
                System.out.println("Escolha uma opcao .");
            }
        } while(opcao != 0);
    }
}