package com.project.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Dvd")
public class Dvd {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long idDvd;
	public String nom;
	public String genre;
	public int ageLimite;
	public String realisateur;
	public String dureeFilm;
	public String production;
	public int prix;
	public String image;
//	private Stock stock;
	
	public Dvd() {
		super();
	}
	public Dvd(String nom, String genre, int ageLimite, String realisateur, String dureeFilm, String production,
			int prix, String image) {
		super();
		this.nom = nom;
		this.genre = genre;
		this.ageLimite = ageLimite;
		this.realisateur = realisateur;
		this.dureeFilm = dureeFilm;
		this.production = production;
		this.prix = prix;
		this.image = image;
	}
	
	public Long getIdDvd() {
		return idDvd;
	}
	public void setIdDvd(Long idDvd) {
		this.idDvd = idDvd;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public int getAgeLimite() {
		return ageLimite;
	}
	public void setAgeLimite(int ageLimite) {
		this.ageLimite = ageLimite;
	}
	public String getRealisateur() {
		return realisateur;
	}
	public void setRealisateur(String realisateur) {
		this.realisateur = realisateur;
	}
	public String getDureeFilm() {
		return dureeFilm;
	}
	public void setDureeFilm(String dureeFilm) {
		this.dureeFilm = dureeFilm;
	}
	public String getProduction() {
		return production;
	}
	public void setProduction(String production) {
		this.production = production;
	}
	public int getPrix() {
		return prix;
	}
	public void setPrix(int prix) {
		this.prix = prix;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "Dvd [idDvd=" + idDvd + ", nom=" + nom + ", genre=" + genre + ", ageLimite=" + ageLimite
				+ ", realisateur=" + realisateur + ", dureeFilm=" + dureeFilm + ", production=" + production + ", prix="
				+ prix + "image=" + image + "]";
	}
}
