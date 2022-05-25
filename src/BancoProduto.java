//Matheus Xavier Soares - 2142651
// Gustavo Alexandre Dias
import java.util.List;
import java.util.ArrayList;

public class BancoProduto{
	private List<Detalhe> BDDet = new ArrayList<Detalhe>();
	private Detalhe det = new Detalhe();

	public List<Detalhe> getBDDet(){
		return BDDet;
	}
	
	public Detalhe consultaDetCod(Detalhe det){
		for(int i = 0; i < BDDet.size();i++){
			if(BDDet.get(i).getCod() == det.getCod()){
				return BDDet.get(i);
			}
		}
		return null;
	}

	public Detalhe excluiDet(Detalhe det){
		det = consultaDetCod(det);
		if(BDDet.remove(det)){
			return det;
		}
		return null;
	}
}