import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("\n\n********** Programa de ajuda aos animais **********\nEscolha uma opcao: ");
        System.out.println("0. Sair.");
        System.out.println("1. Descobrir se uma marca machuca os animais.");
        System.out.println("2. Ver biblioteca de livros sobre animais.");
        System.out.println("3. Recomendar um livro.");
        System.out.println("4. Adotar um PET.");
    }

   public static void sair(){
        System.out.println("Obrigado por usar o programa.");
    }
  
    public static void pesquisaMarca(){
      ArrayList<Marca> marcas = new ArrayList<Marca>();
      Marca m1 = new Marca("Avon", "https://epocanegocios.globo.com/Empresa/noticia/2019/12/epoca-negocios-avon-anuncia-fim-dos-testes-em-animais-em-todas-as-empresas-da-marca-no-mundo.html");
      
        System.out.println("Qual o nome da marca?");
    }
    
    public static void exibeBiblioteca(){
      ArrayList<Livro> booklist = new ArrayList<Livro>();
      Livro l1 = new Livro("Animal Liberation");
    Livro l2 = new Livro("Vegetable Kingdom");
    Livro l3 = new Livro("Some We Love, Some We Hate, Some We Eat: Why It's So Hard to Think Straight About Animals");
      Livro l4 = new Livro("Sins of the Flesh: A History of Ethical Vegetarian Thought");
      Livro l5 = new Livro("The Case for Animal Rights");
      Livro l6 = new Livro("Animal Philosophy");
      Livro l7 = new Livro("Animal Ethics and Philosophy: Questioning the Orthodoxy ");
      Livro l8 = new Livro("Critical Terms for Animal Studies");
      Livro l9 = new Livro("Looking at Animals in Human History");
      Livro l10 = new Livro("Perceiving Animals: Humans and Beasts in Early Modern English Culture");
      Livro l11 = new Livro("The Animal Mind: An Introduction to the Philosophy of Animal Cognition");
      Livro l12 = new Livro("What Would Animals Say If We Asked the Right Questions?");
       Livro l13 = new Livro("An Immense World: How Animal Senses Reveal the Hidden Realms Around Us");
      Livro l14 = new Livro("The Emotional Lives of Animals");
      Livro l15 = new Livro("Why Look At Animals?");
      Livro l16 = new Livro("Animal Testing: Life-Saving Research vs. Animal Welfare ");
      Livro l17 = new Livro("Alternatives To Animal Testing");
      Livro l18 = new Livro("Applied Ethics in Animal Research: Philosophy, Regulation, and Laboratory Applications");
      Livro l19 = new Livro("Free the Animals: The Amazing True Story of the Animal Liberation Front");
       Livro l20 = new Livro("Alex & Me: How a Scientist and a Parrot Discovered a Hidden World of Animal Intelligence--and Formed a Deep Bond in the Process");
    booklist.add(l1);
    booklist.add(l2);
    booklist.add(l3);
    booklist.add(l4);
    booklist.add(l5);
    booklist.add(l6);  
    booklist.add(l7);
    booklist.add(l8);
    booklist.add(l9);    
    booklist.add(l10);
    booklist.add(l11);
    booklist.add(l12);
    booklist.add(l13);
    booklist.add(l14);
    booklist.add(l15);
    booklist.add(l16);
    booklist.add(l17);
    booklist.add(l18);
    booklist.add(l19);
    booklist.add(l20);
 System.out.println("\nBiblioteca de livros: ");
      
        for (int i = 0; i < booklist.size(); i++) {
          int livrosEnumerados = i + 1;
System.out.println("(" + livrosEnumerados +") " + booklist.get(i).nome);
    }

    }
    
    public static void recebeRecomendacao(){
        System.out.println("Qual livro voce gostaria de recomendar para a biblioteca?");
    }
     
    public static void exibeGalinhas(){
       ArrayList<Galinha> galinhas = new ArrayList<Galinha>();
      Galinha g1 = new Galinha("Piu", 5, "Laranja", "Rosa", "Brasil", 4, "Pouca", "Siciliana");
      Galinha g2 = new Galinha("Anita", 10, "Branca", "Ervilha", "Asia", 5, "Media", "Cochins");
      Galinha g3 = new Galinha("Amarelinha", 1, "Amarela", "Noz", "Estados Unidos", 4, "Muita", "Malaio");
     galinhas.add(g1);
     galinhas.add(g2);
     galinhas.add(g3);
        for (int i = 0; i < galinhas.size(); i++) {
          int galinhasEnumeradas = i + 1;
System.out.println("\n" + "(" + galinhasEnumeradas +")" + "\n Nome: " + galinhas.get(i).nome + "\n Idade: " + galinhas.get(i).idade + "\n Cor: " + galinhas.get(i).cor + "\n Tipo de crista: " + galinhas.get(i).tipoDeCrista + "\n Origem: " + galinhas.get(i).origem + "\n Numero de Dedos: " + galinhas.get(i).numeroDeDedos + "\n Quantidade de Franjas: " + galinhas.get(i).quantidadeDeFranjas +"\n Raca: " + galinhas.get(i).raca +"\n");
    }
    }

    public static void exibeCachorros(){
       ArrayList<Cachorro> cachorros = new ArrayList<Cachorro>();
      Cachorro c1 = new Cachorro("Zeus", 14, "Caramelo", " Curto liso", 100, 4,  "Vira-lata");
      Cachorro c2 = new Cachorro("Scooby", 1, "Branco", "Longo ondulado ", 25, 7, "Shih Tzu");
      Cachorro c3 = new Cachorro("Bidu", 5, "Chocolate", "Dupla", 70, 4.5, "Rottweiler");
     cachorros.add(c1);
     cachorros.add(c2);
     cachorros.add(c3);
        for (int i = 0; i < cachorros.size(); i++) {
          int cachorrosEnumerados = i + 1;
System.out.println("\n" + "(" +  cachorrosEnumerados +")" + "\n Nome: " +  cachorros.get(i).nome + "\n Idade: " +  cachorros.get(i).idade + "\n Cor: " +  cachorros.get(i).cor + "\n Pelagem: " +  cachorros.get(i).pelagem + "\n Porte: " + cachorros.get(i).porte + " cm" + "\n Peso: " +  cachorros.get(i).peso +"\n Raca: " +  cachorros.get(i).raca +"\n");
    }
    }

    public static void adotaPet(){
        System.out.println(" \n Que tipo de animal voce gostaria de adotar?");
       System.out.println(" (1) Galinha\n (2) Cachorro \n (3) Gato");
      Scanner input = new Scanner(System.in);
        int escolhaDoTipoAnimal;
        
        System.out.println("\n Numero da escolha: ");
        escolhaDoTipoAnimal = input.nextInt();
      switch(escolhaDoTipoAnimal){
          case 1:
          System.out.printf("\nGalinhas disponiveis para adocao:");
          exibeGalinhas();
          break;
          case 2:
          System.out.printf("\nCachorros disponiveis para adocao:");
          exibeCachorros();
          break;
          case 3:
          System.out.printf("\nGatos disponiveis para adocao:");
          break;
        default:
          System.out.printf("\nNao temos este animal para adocao!");
      }
    }
    
    public static void main(String[] args) {
        int opcao;
   
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
