package etape15;

public class Personne {
	 private String nom;
	    private String prenom;
	    private int age;
		public String getNom() {
			return nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public int getAge() {
			return age;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public void setAge(int age) {
			this.age = age;
		}
		
		/**
		 * @param nom
		 * @param prenom
		 * @param age
		 */
		public Personne(String nom, String prenom, int age) {
			super();
			this.nom = nom;
			this.prenom = prenom;
			this.age = age;
		}
		@Override
		public String toString() {
			return "Personne [nom=" + nom + ", prenom=" + prenom + ", age=" + age + "]";
		}
	    

}
