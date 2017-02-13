package com.intesasanpaolo.fenice.ispfenice.general.logic.api.to;

import java.sql.Date;

import io.oasp.module.jpa.common.api.to.SearchCriteriaTo;

/**
 * This is the {@link SearchCriteriaTo search criteria} {@link net.sf.mmm.util.transferobject.api.TransferObject TO}
 * used to find {@link com.intesasanpaolo.fenice.ispfenice.general.common.api.Intervista}s.
 *
 */
public class IntervistaSearchCriteriaTo extends SearchCriteriaTo {

  private static final long serialVersionUID = 1L;

  private Long idIntervista;

  private String nome;

  private String cognome;

  private Date dataNascita;

  private String ndg;

  private String codAbi;

  private String cellulare;

  private String email;

  private String indirizzo;

  /**
   * The constructor.
   */
  public IntervistaSearchCriteriaTo() {

    super();
  }

  public Long getIdIntervista() {

    return this.idIntervista;
  }

  public void setIdIntervista(Long idIntervista) {

    this.idIntervista = idIntervista;
  }

  public String getNome() {

    return this.nome;
  }

  public void setNome(String nome) {

    this.nome = nome;
  }

  public String getCognome() {

    return this.cognome;
  }

  public void setCognome(String cognome) {

    this.cognome = cognome;
  }

  public Date getDataNascita() {

    return this.dataNascita;
  }

  public void setDataNascita(Date dataNascita) {

    this.dataNascita = dataNascita;
  }

  public String getNdg() {

    return this.ndg;
  }

  public void setNdg(String ndg) {

    this.ndg = ndg;
  }

  public String getCodAbi() {

    return this.codAbi;
  }

  public void setCodAbi(String codAbi) {

    this.codAbi = codAbi;
  }

  public String getCellulare() {

    return this.cellulare;
  }

  public void setCellulare(String cellulare) {

    this.cellulare = cellulare;
  }

  public String getEmail() {

    return this.email;
  }

  public void setEmail(String email) {

    this.email = email;
  }

  public String getIndirizzo() {

    return this.indirizzo;
  }

  public void setIndirizzo(String indirizzo) {

    this.indirizzo = indirizzo;
  }

}
