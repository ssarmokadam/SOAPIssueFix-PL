package com.intesasanpaolo.fenice.ispfenice.general.logic.api.to;

import com.intesasanpaolo.fenice.ispfenice.general.common.api.Preventivo;
import com.intesasanpaolo.fenice.ispfenice.general.common.api.to.AbstractEto;

/**
 * Entity transport object of Preventivo
 */
public class PreventivoEto extends AbstractEto implements Preventivo {

  private static final long serialVersionUID = 1L;

  private Long idPreventivo;

  private String codProdotto;

  private Long importoRichiesto;

  private Long durataMesi;

  private Long offertaId;

  @Override
  public Long getIdPreventivo() {

    return idPreventivo;
  }

  @Override
  public void setIdPreventivo(Long idPreventivo) {

    this.idPreventivo = idPreventivo;
  }

  @Override
  public String getCodProdotto() {

    return codProdotto;
  }

  @Override
  public void setCodProdotto(String codProdotto) {

    this.codProdotto = codProdotto;
  }

  @Override
  public Long getImportoRichiesto() {

    return importoRichiesto;
  }

  @Override
  public void setImportoRichiesto(Long importoRichiesto) {

    this.importoRichiesto = importoRichiesto;
  }

  @Override
  public Long getDurataMesi() {

    return durataMesi;
  }

  @Override
  public void setDurataMesi(Long durataMesi) {

    this.durataMesi = durataMesi;
  }

  @Override
  public Long getOffertaId() {

    return offertaId;
  }

  @Override
  public void setOffertaId(Long offertaId) {

    this.offertaId = offertaId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.idPreventivo == null) ? 0 : this.idPreventivo.hashCode());
    result = prime * result + ((this.codProdotto == null) ? 0 : this.codProdotto.hashCode());
    result = prime * result + ((this.importoRichiesto == null) ? 0 : this.importoRichiesto.hashCode());
    result = prime * result + ((this.durataMesi == null) ? 0 : this.durataMesi.hashCode());

    result = prime * result + ((this.offertaId == null) ? 0 : this.offertaId.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {

    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    // class check will be done by super type EntityTo!
    if (!super.equals(obj)) {
      return false;
    }
    PreventivoEto other = (PreventivoEto) obj;
    if (this.idPreventivo == null) {
      if (other.idPreventivo != null) {
        return false;
      }
    } else if (!this.idPreventivo.equals(other.idPreventivo)) {
      return false;
    }
    if (this.codProdotto == null) {
      if (other.codProdotto != null) {
        return false;
      }
    } else if (!this.codProdotto.equals(other.codProdotto)) {
      return false;
    }
    if (this.importoRichiesto == null) {
      if (other.importoRichiesto != null) {
        return false;
      }
    } else if (!this.importoRichiesto.equals(other.importoRichiesto)) {
      return false;
    }
    if (this.durataMesi == null) {
      if (other.durataMesi != null) {
        return false;
      }
    } else if (!this.durataMesi.equals(other.durataMesi)) {
      return false;
    }

    if (this.offertaId == null) {
      if (other.offertaId != null) {
        return false;
      }
    } else if (!this.offertaId.equals(other.offertaId)) {
      return false;
    }
    return true;
  }
}
