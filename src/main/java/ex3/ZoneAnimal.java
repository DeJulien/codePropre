package ex3;

public enum ZoneAnimal {
	
	ZONECARNIVORE("zoneCar",1),
	AQUARIUM("aquarium",2),
	FERMEREPTILE("reptile",3),
	SAVANEAFRICAINE("savane",4);
	
	private String zone;
	private int ordre;
	
	private ZoneAnimal(String zone,int ordre) {
		this.zone = zone;
		this.ordre=ordre;
		}

	public String getZone() {
		return zone;
		}
		public void setNom(String nom) {
		this.zone = nom;
		}
		public int getOrdre() {
		return ordre;
		}
		public void setOrdre(int ordre) {
		this.ordre = ordre;
		}
}
