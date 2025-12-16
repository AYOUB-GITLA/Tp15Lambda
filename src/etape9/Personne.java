package etape9;

public class Personne {
	 private String nom;
	    private int age;
	    private String ville;
		/**
		 * @param nom
		 * @param age
		 * @param ville
		 */
		public Personne(String nom, int age, String ville) {
			super();
			this.nom = nom;
			this.age = age;
			this.ville = ville;
		}
		public String getNom() {
			return nom;
		}
		public int getAge() {
			return age;
		}
		public String getVille() {
			return ville;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public void setVille(String ville) {
			this.ville = ville;
		}
		@Override
		public String toString() {
			return "Personne [nom=" + nom + ", age=" + age + ", ville=" + ville + "]";
		}
	    
	    

}
