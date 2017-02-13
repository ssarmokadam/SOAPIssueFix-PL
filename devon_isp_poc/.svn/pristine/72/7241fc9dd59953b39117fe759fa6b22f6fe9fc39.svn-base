package com.intesasanpaolo.fenice.ispfenice.general.logic.api.to;

import com.intesasanpaolo.fenice.ispfenice.general.common.api.Offerta;
import com.intesasanpaolo.fenice.ispfenice.general.common.api.to.AbstractEto;

/**
 * Entity transport object of Offerta
 */
public class OffertaEto extends AbstractEto implements Offerta {

  private static final long serialVersionUID = 1L;

  private Long idOfferta;

  private String ndg;

  private Long intervistaId;

  @Override
  public Long getIdOfferta() {

    return idOfferta;
  }

  @Override
  public void setIdOfferta(Long idOfferta) {

    this.idOfferta = idOfferta;
  }

  @Override
  public String getNdg() {

    return ndg;
  }

  @Override
  public void setNdg(String ndg) {

    this.ndg = ndg;
  }

  @Override
  public Long getIntervistaId() {

    return intervistaId;
  }

  @Override
  public void setIntervistaId(Long intervistaId) {

    this.intervistaId = intervistaId;
  }

  @Override
  public int hashCode() {

    final int prime = 31;
    int result = super.hashCode();
    result = prime * result + ((this.idOfferta == null) ? 0 : this.idOfferta.hashCode());
    result = prime * result + ((this.ndg == null) ? 0 : this.ndg.hashCode());

    result = prime * result + ((this.intervistaId == null) ? 0 : this.intervistaId.hashCode());

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
    OffertaEto other = (OffertaEto) obj;
    if (this.idOfferta == null) {
      if (other.idOfferta != null) {
        return false;
      }
    } else if (!this.idOfferta.equals(other.idOfferta)) {
      return false;
    }
    if (this.ndg == null) {
      if (other.ndg != null) {
        return false;
      }
    } else if (!this.ndg.equals(other.ndg)) {
      return false;
    }

    if (this.intervistaId == null) {
      if (other.intervistaId != null) {
        return false;
      }
    } else if (!this.intervistaId.equals(other.intervistaId)) {
      return false;
    }

    return true;
  }
}
