//Matheus Xavier Soares - 2142651

public abstract class Produto{ 
	
	private int cod;
	private String nome;
	private int quantidade;
	
	public Produto(){
		cod = 0;
		nome = "";
                quantidade = 0;
	}
	public Produto(int cod, String nome){
		this.cod = cod;
		this.nome = nome;
                this.quantidade = quantidade;
	}
		
	
	public int getCod(){
		return cod;
	}
	public String getNome(){
		return nome;
	}	
	public void setCod(int cod){
		this.cod = cod;
	}
	public void setNome(String nome){
		this.nome = nome;
	}
        public int getQuantidade(){
            return quantidade;
        }
        public void setQuantidade(int quantidade){
            this.quantidade = quantidade;
        }
}