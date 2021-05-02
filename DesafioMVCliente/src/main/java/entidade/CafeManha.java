package entidade;

public class CafeManha {

	private int id;
	private String itemCafe;
	private String cpfColaborador;
	
	@Override
	public boolean equals(Object obj) {
		CafeManha cafemanha = (CafeManha) obj;
		if (this.itemCafe.equalsIgnoreCase(cafemanha.getItemCafe())) {
			return true;
		} else {
			return false;
		}
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemCafe() {
		return itemCafe;
	}
	public void setItemCafe(String itemCafe) {
		this.itemCafe = itemCafe;
	}
	public String getCpfColaborador() {
		return cpfColaborador;
	}
	public void setCpfColaborador(String cpfColaborador) {
		this.cpfColaborador = cpfColaborador;
	}
	
}
