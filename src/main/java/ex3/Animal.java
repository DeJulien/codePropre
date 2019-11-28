package ex3;

import java.util.List;

public class Animal {
	
	private String types;
	private String noms;
	private String comportements;
	
	public Animal(String types,String noms,String comportements)
	{
		this.types=types;
		this.noms=noms;
		this.comportements=comportements;
	}

	/**Getter
	 * @return the types
	 */
	public String getTypes() {
		return types;
	}

	/**Setter
	 * @param types the types to set
	 */
	public void setTypes(String types) {
		this.types = types;
	}

	/**Getter
	 * @return the noms
	 */
	public String getNoms() {
		return noms;
	}

	/**Setter
	 * @param noms the noms to set
	 */
	public void setNoms(String noms) {
		this.noms = noms;
	}

	/**Getter
	 * @return the comportements
	 */
	public String getComportements() {
		return comportements;
	}

	/**Setter
	 * @param comportements the comportements to set
	 */
	public void setComportements(String comportements) {
		this.comportements = comportements;
	}

	
	

}
