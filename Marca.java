public class Marca {
  String nome;
  String link;
  boolean fazTestes;

  public Marca(String nome, boolean fazTestes) {
    this.nome = nome;
    this.link = "";
    this.fazTestes = fazTestes;
  }
  
  public Marca(String nome, boolean fazTestes, String link) {
    this.nome = nome;
    this.fazTestes = fazTestes;
    this.link = link;
  }

  public String getNome(){
    return this.nome;
  }

    public String getLink(){
    return this.link;
  }
  
  public boolean fazTestesEmAnimais(){
    return this.fazTestes;
  }
}
