import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void menu(){
        System.out.println("\n\n********** Programa de ajuda aos animais **********\nEscolha uma opcao: ");
        System.out.println("0. Sair.");
        System.out.println("1. Descobrir se uma marca testa em animais.");
        System.out.println("2. Ver biblioteca de livros sobre animais.");
        System.out.println("3. Recomendar um livro.");
        System.out.println("4. Adotar um PET.");
    }

   public static void sair(){
        System.out.println("Obrigado por usar o programa.");
    }
  
    public static void pesquisaMarca(){
      ArrayList<Marca> marcas = new ArrayList<Marca>();
      marcas.add(new Marca("Gillette", true, "https://redorangepeach.com/brands/gillette/#")); 
      marcas.add(new Marca("Bic", true, "https://www.vista-se.com.br/bic-lider-mundial-de-canetas-e-isqueiros-testa-em-animais/")); 
      marcas.add(new Marca("Rexona", true, "https://www.crueltyfreekitty.com/brands/rexona/")); 
      marcas.add(new Marca("Band-Aid", true, "https://crueltyfree.peta.org/company/band-aid-johnson-johnson/")); 
      marcas.add(new Marca("Nescau", true, "https://lookaholic.wordpress.com/2013/04/29/marcas-alimenticias-que-pertencem-a-companhias-que-fazemnao-fazem-testes-em-animais/")); 
      marcas.add(new Marca("Avon", false)); 
      marcas.add(new Marca("Minuano", false)); 
      marcas.add(new Marca("Ype", false)); 
      marcas.add(new Marca("Natura", false)); 
      marcas.add(new Marca("Jequiti", false)); 
      marcas.add(new Marca("Victoria's Secret", false));
      marcas.add(new Marca("Dr. Oetker", false));
  
      Scanner valorPesquisado = new Scanner (System.in);
        System.out.println("Qual o nome da marca?");
        String marcaPesquisada = valorPesquisado.nextLine();

boolean marcaEncontrada = false;
for(Marca x : marcas ){
  if(x.getNome().equalsIgnoreCase(marcaPesquisada)){
      marcaEncontrada = true;
      if(x.fazTestesEmAnimais())
      {
        System.out.println("A marca " + x.getNome() + " faz testes em animais.\nLink para mais informacoes: " + x.getLink() ); 
      }
      else
      {
        System.out.println("A marca " + x.getNome() + " nao faz testes em animais." );  
      }
  }
}
if(marcaEncontrada == false){
    System.out.println("Marca não encontrada.");
}

    }
    
    public static void exibeBiblioteca(ArrayList<Livro> booklist){
        for (int i = 0; i < booklist.size(); i++) {
          int livrosEnumerados = i + 1;
System.out.println("(" + livrosEnumerados +") " + booklist.get(i).nome);
    }
}
    
    public static void recebeRecomendacao(ArrayList<Livro> booklist) {
       Scanner livroDigitado = new Scanner (System.in);
         System.out.println("Qual livro voce gostaria de recomendar para a biblioteca?");
        String nomelivroRecomendado = livroDigitado.nextLine();
        Livro novoLivro = new Livro(nomelivroRecomendado);
        int numeroDoLivroNovo = booklist.size() + 1;
           booklist.add(novoLivro);  
       System.out.println("O livro '" +  nomelivroRecomendado + "' foi adicionado a biblioteca! Este é o livro " + numeroDoLivroNovo + " da biblioteca");
           
    }
     
    public static void exibeGalinhas(ArrayList<Galinha> galinhas){
        for (int i = 0; i < galinhas.size(); i++) {
          int galinhasEnumeradas = i + 1;
System.out.println("\n" + "(" + galinhasEnumeradas +")" + "\n Nome: " + galinhas.get(i).nome + "\n Idade: " + galinhas.get(i).idade + "\n Cor: " + galinhas.get(i).cor + "\n Tipo de crista: " + galinhas.get(i).tipoDeCrista + "\n Origem: " + galinhas.get(i).origem + "\n Numero de Dedos: " + galinhas.get(i).numeroDeDedos + "\n Quantidade de Franjas: " + galinhas.get(i).quantidadeDeFranjas +"\n Raca: " + galinhas.get(i).raca +"\n");
    }
    }

    public static void exibeCachorros(ArrayList<Cachorro> cachorros){
        for (int i = 0; i < cachorros.size(); i++) {
          int cachorrosEnumerados = i + 1;
System.out.println("\n" + "(" +  cachorrosEnumerados +")" + "\n Nome: " +  cachorros.get(i).nome + "\n Idade: " +  cachorros.get(i).idade + "\n Cor: " +  cachorros.get(i).cor + "\n Pelagem: " +  cachorros.get(i).pelagem + "\n Porte: " + cachorros.get(i).porte + " cm" + "\n Peso: " +  cachorros.get(i).peso +"\n Raca: " +  cachorros.get(i).raca +"\n");
       }
    }

 public static void exibeGatos(ArrayList<Gato> gatos){
        for (int i = 0; i < gatos.size(); i++) {
          int gatosEnumerados = i + 1;
System.out.println("\n" + "(" +  gatosEnumerados +")" + "\n Nome: " +  gatos.get(i).nome + "\n Idade: " +  gatos.get(i).idade + "\n Cor: " +  gatos.get(i).cor + "\n Pelagem: " +  gatos.get(i).pelagem + "\n Comprimento: " + gatos.get(i).comprimento + " cm"  +"\n Raca: " +  gatos.get(i).raca +"\n");
       }
    }
  public static int escolheTipoDePet(){
     System.out.println(" \n Que tipo de animal voce gostaria de adotar?");
       System.out.println(" (1) Galinha\n (2) Cachorro \n (3) Gato");
      Scanner input = new Scanner(System.in);
        int escolhaDoTipoAnimal;
        
        System.out.println("\n Numero da escolha: ");
        escolhaDoTipoAnimal = input.nextInt();
    return escolhaDoTipoAnimal;
  }

  public static void escolheGalinha( ArrayList<Galinha> galinhas){
      System.out.println("Digite o numero da galinha que voce gostaria de adotar:");
      int galinhaEscolhida;
      Scanner numeroDaGalinha = new Scanner(System.in);
      galinhaEscolhida = numeroDaGalinha.nextInt();
      galinhaEscolhida = galinhaEscolhida - 1;
      if (galinhaEscolhida < galinhas.size())
      System.out.println("Voce escolheu a galinha " + galinhas.get(galinhaEscolhida).nome +   ". Ela estara te aguardando para adocao no lar de PETs, as 15 horas.");
    else {
       System.out.println("Galinha nao encontrada");
    }
    }

 public static void escolheCachorro(ArrayList<Cachorro> cachorros){
      System.out.println("Digite o numero do cachorro que voce gostaria de adotar:");
      int cachorroEscolhido;
      Scanner numeroDoCachorro = new Scanner(System.in);
      cachorroEscolhido = numeroDoCachorro.nextInt();
      cachorroEscolhido = cachorroEscolhido - 1;
      if (cachorroEscolhido < cachorros.size())
      System.out.println("Voce escolheu o cachorro " + cachorros.get(cachorroEscolhido).nome +   ". Ele estara te aguardando para adocao no lar de PETs, as 14 horas.");
    else {
       System.out.println("Cachorro nao encontrado");
    }
    }

     public static void escolheGato(ArrayList<Gato> gatos){
      System.out.println("Digite o numero do gato que voce gostaria de adotar:");
      int gatoEscolhido;
      Scanner numeroDoGato = new Scanner(System.in);
      gatoEscolhido = numeroDoGato.nextInt();
      gatoEscolhido = gatoEscolhido - 1;
      if (gatoEscolhido < gatos.size())
      System.out.println("Voce escolheu o gato " + gatos.get(gatoEscolhido).nome +   ". Ele estara te aguardando para adocao no lar de PETs, as 16 horas.");
    else {
       System.out.println("Gato nao encontrado");
    }
    }
  
    public static void adotaPet(ArrayList<Galinha> galinhas, ArrayList<Cachorro> cachorros, ArrayList<Gato> gatos){
    
      switch(escolheTipoDePet()){
          case 1:
          System.out.printf("\nGalinhas disponiveis para adocao:");
          exibeGalinhas(galinhas);
          escolheGalinha(galinhas);
          break;
          case 2:
          System.out.printf("\nCachorros disponiveis para adocao:");
          exibeCachorros(cachorros);
          escolheCachorro(cachorros);
          break;
          case 3:
          System.out.printf("\nGatos disponiveis para adocao:");
          exibeGatos(gatos);
          escolheGato(gatos);
          break;
        default:
          System.out.printf("\nNao temos este animal para adocao!");
      }
    }
 
    public static void main(String[] args) {
        ArrayList<Galinha> galinhas = new ArrayList<Galinha>();
      Galinha g1 = new Galinha("Piu", 5, "Laranja", "Rosa", "Brasil", 4, "Pouca", "Siciliana");
      Galinha g2 = new Galinha("Anita", 10, "Branca", "Ervilha", "Asia", 5, "Media", "Cochins");
      Galinha g3 = new Galinha("Amarelinha", 1, "Amarela", "Noz", "Estados Unidos", 4, "Muita", "Malaio");
     galinhas.add(g1);
     galinhas.add(g2);
     galinhas.add(g3);

       ArrayList<Cachorro> cachorros = new ArrayList<Cachorro>();
      Cachorro c1 = new Cachorro("Zeus", 14, "Caramelo", " Curto liso", 100, 4,  "Vira-lata");
      Cachorro c2 = new Cachorro("Scooby", 1, "Branco", "Longo ondulado ", 25, 7, "Shih Tzu");
      Cachorro c3 = new Cachorro("Bidu", 5, "Chocolate", "Dupla", 70, 4.5, "Rottweiler");
     cachorros.add(c1);
     cachorros.add(c2);
     cachorros.add(c3);

      ArrayList<Gato> gatos = new ArrayList<Gato>();
      Gato gat1 = new Gato("Thunder", 14, "Preto", " Solida", 30,  "SRD");
      Gato gat2 = new Gato("Chips", 3, "Branco", "Tabby", 25, " Sphynx");
      Gato gat3 = new Gato("Shelby", 1, "Vermelho", "Particolor", 35, "Siamês");
     gatos.add(gat1);
     gatos.add(gat2);
     gatos.add(gat3);

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
                exibeBiblioteca(booklist);
                break;
                
            case 3:
                recebeRecomendacao(booklist);
                break;
                
            case 4:
                adotaPet(galinhas, cachorros, gatos);
                break;
            
            default:
                System.out.println("Escolha uma opcao .");
            }
        } while(opcao != 0);
    }
}
