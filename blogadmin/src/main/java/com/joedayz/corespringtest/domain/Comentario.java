package com.joedayz.corespringtest.domain;

/**
 * Comentario generated by @author Susan Inga (susan.inga@joedayz.pe)
 */
public class Comentario implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1616910161646873742L;
	private Long id;
	private Long idPost;
	private String nombre;
	private String correoElectronico;
	private String comentario;

	public Comentario() {
	}

	public Comentario(Long idPost, String nombre, String correoElectronico,
			String comentario) {
		this.idPost = idPost;
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.comentario = comentario;
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPost() {
		return idPost;
	}

	public void setIdPost(Long idPost) {
		this.idPost = idPost;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return this.correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getComentario() {
		return this.comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	@Override
	public String toString() {
		return "Comentario [id=" + id + ", idPost=" + idPost + ", nombre=" + nombre
				+ ", correoElectronico=" + correoElectronico + "]";
	}

	
}