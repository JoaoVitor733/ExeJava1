package Aula13;

public class Cachorro extends Lobo{
	//SOBREPOSI��O DE METODOS
	  @Override
	  public void emitirSom() {
		  System.out.println("AU! AU! AU!");
	  }
	  
	  //METODOS COM ASSINATURAS DIFERENTES
	  public void reagir(String frase) {
		  if(frase == "Toma a comida" || frase == "Ol�") {
			  System.out.println("Abanar e latir");
		  }else {
			  System.out.println("Rosnar");
		  }
	  }
	  
	  public void reagir(int hora, int min) {
		  if(hora < 12) {
			  System.out.println("Abanar");
		  }else {
			  if(hora >= 18) {
				  System.out.println("Ignorar");
			  }else {
				 System.out.println("Abanar e latir"); 
			  }
		  }
	  }
	  
	  public void reagir(boolean dono) {
		   if(dono) {
			   System.out.println("Abanar");
		   }else {
			   System.out.println("Rosnar e latir");
		   }
	  }
	  
	  public void reagir(int idade, float peso) {
		    if(idade < 5) {
		    	if(peso < 10) {
		    		 System.out.println("Abanar");
		    	}else {
		    		 System.out.println("Latir");
		    	}
		    }else {
		    	if(peso < 10) {
		    		 System.out.println("Rosnar");
		    	}else {
		    		 System.out.println("Ignorar");
		    	}
		    }
	  }
}
