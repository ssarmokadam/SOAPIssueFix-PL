package com.intesasanpaolo.fenice.ispfenice.general.common.api;

import java.sql.Date;

public interface Intervista extends ApplicationEntity {

  public Long getIdIntervista();

  public void setIdIntervista(Long idIntervista);

  public String getNome();

  public void setNome(String nome);

  public String getCognome();

  public void setCognome(String cognome);

  public Date getDataNascita();

  public void setDataNascita(Date dataNascita);

  public String getNdg();

  public void setNdg(String ndg);

  public String getCodAbi();

  public void setCodAbi(String codAbi);

  public String getCellulare();

  public void setCellulare(String cellulare);

  public String getEmail();

  public void setEmail(String email);

  public String getIndirizzo();

  public void setIndirizzo(String indirizzo);

}
