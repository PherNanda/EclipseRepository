
public class Alumne {
	
	//propietats	
		private String nom;
		private float nota;
		private static int contador = 0;
		
		//constructor
		public Alumne() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Alumne(String nom, float nota) {
			super();
			Alumne.contador++;
			this.nom = nom;
			this.nota = nota;
		}
		
		
		//getters i setters
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public float getNota() {
			return nota;
		}
		public void setNota(float nota) {
			this.nota = nota;
		}
		public static int getContador() {
			return contador;
		}
		public static void setContador(int contador) {
			Alumne.contador = contador;
		}
		
		
		public void CalcularNotaFinal(){
			
			
		}


}
