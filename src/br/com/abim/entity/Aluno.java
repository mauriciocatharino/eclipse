package br.com.abim.entity;

public class Aluno implements IPessoa {

	private long id;
	private String nome;

	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#getId()
	 */
	@Override
	public long getId() {
		return id;
	}


	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#setId(long)
	 */
	@Override
	public void setId(long id) {
		this.id = id;
	}

	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#getNome()
	 */
	@Override
	public String getNome() {
		return nome;
	}

	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#setNome(java.lang.String)
	 */
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}


	/* (non-Javadoc)
	 * @see br.com.abim.entity.IPessoa#toString()
	 */
	@Override
	public String toString() {
		return "A pessoa é  [id=" + id + ", nome=" + nome + "]";
	}
	
	

}
