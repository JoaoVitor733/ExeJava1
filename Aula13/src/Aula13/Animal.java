package Aula13;

public abstract class Animal {
	//ATRIBUTOS
     protected float peso;
     protected int idade;
     protected int membros;
     
     //METODOS ABSTRATO
     public abstract void emitirSom();

     //METODOS ESPECIAIS
	 public float getPeso() {
		return peso;
	 }

	 public void setPeso(float peso) {
		 this.peso = peso;
	 }

	 public int getIdade() {
		return idade;
	 }

	 public void setIdade(int idade) {
		this.idade = idade;
	 }

	 public int getMembros() {
		return membros;
	 }

	public void setMembros(int membros) {
		this.membros = membros;
	}
     
}
