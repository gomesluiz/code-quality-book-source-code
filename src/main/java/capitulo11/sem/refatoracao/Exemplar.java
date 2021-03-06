package capitulo11.sem.refatoracao;

public class Exemplar {
  private int numero;
  private String titulo;
  private String autor;
  private String isbn;
  private String editora;
  private double multa;
  private boolean estaEmprestado;
  private boolean estaDanificado;

  public Exemplar(int numero, String titulo, String autor
      , String isbn, String editora, double multa) {
    this.setNumero(numero);
    this.setTitulo(titulo);
    this.setAutor(autor);
    this.setIsbn(isbn);
    this.setEditora(editora);
    this.setEmprestado(false);
    this.setDanificado(false);
    this.setMulta(multa);
  }

  public int getNumero() {
    return this.numero;
  }

  private void setNumero(int numero) {
    this.numero = numero;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getIsbn() {
    return this.isbn;
  }

  public void setIsbn(String isbn) {
    this.isbn = isbn;
  }

  public String getEditora() {
    return this.editora;
  }

  public void setEditora(String editora) {
    this.editora = editora;
  }

  public boolean estaEmprestado() {
    return this.estaEmprestado;
  }

  public void setEmprestado(boolean estaEmprestado) {
    this.estaEmprestado = estaEmprestado;
  }

  public boolean estaDanificado() {
    return this.estaDanificado;
  }

  public void setDanificado(boolean estaDanificado) {
    this.estaDanificado = estaDanificado;
  }

  public double getMulta() {
    return this.multa;
  }
  public void setMulta(double multa) {
    this.multa = multa;
  }

}
