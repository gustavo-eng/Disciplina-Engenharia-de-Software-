//Matheus Xavier Soares - 2142651

public class Detalhe extends Produto{
	private double preco;
        private String descricao;
	
	public Detalhe(){
		preco = 0.00;
                descricao = "";
	}
	public Detalhe(double preco, String descricao){
		this.preco = preco;
                this.descricao = descricao;
	}

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public String getDescricao(){
        return descricao;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }
    
    
}

