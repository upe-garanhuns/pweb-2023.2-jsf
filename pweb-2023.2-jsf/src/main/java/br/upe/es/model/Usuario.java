package br.upe.es.model;

public class Usuario {
  private String nome;
  private String email;
  private String genero;
  private int idade;
  private String comentario;
  private String senha;
  private String oculto;

  public Usuario() {}

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getGenero() {
    return genero;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public int getIdade() {
    return idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getComentario() {
    return comentario;
  }

  public void setComentario(String comentario) {
    this.comentario = comentario;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getOculto() {
    return oculto;
  }

  public void setOculto(String oculto) {
    this.oculto = oculto;
  }
}
