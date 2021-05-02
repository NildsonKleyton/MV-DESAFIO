package endidade;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name = "CAFEMANHA")
public class CafeManha {

	@Id
	@Column(name = "ID", nullable = false)
	@GeneratedValue(generator = "S_ID_CAFE")
	@SequenceGenerator(name = "S_ID_CAFE", sequenceName = "S_ID_CAFE", allocationSize = 1)
	private int id;
	@Column(name = "ITEMCAFE", nullable = false)
	private String itemCafe;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CPFCOLABORADOR", referencedColumnName = "CPF", nullable = false)
	private Colaborador colaborador;
	
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

	public Colaborador getColaborador() {
		return colaborador;
	}

	public void setColaborador(Colaborador colaborador) {
		this.colaborador = colaborador;
	}



}
