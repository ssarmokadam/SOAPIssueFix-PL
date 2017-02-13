package com.intesasanpaolo.fenice.ispfenice.general.logic.api.to;

import java.util.Set;

import com.intesasanpaolo.fenice.ispfenice.general.common.api.to.AbstractCto;

/**
 * Composite transport object of Offerta
 */
public class OffertaCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private OffertaEto offerta;

  private IntervistaEto intervista;

  private Set<PreventivoEto> preventivo;

  public OffertaEto getOfferta() {

    return offerta;
  }

  public void setOfferta(OffertaEto offerta) {

    this.offerta = offerta;
  }

  public IntervistaEto getIntervista() {

    return intervista;
  }

  public void setIntervista(IntervistaEto intervista) {

    this.intervista = intervista;
  }

  public Set<PreventivoEto> getPreventivo() {

    return preventivo;
  }

  public void setPreventivo(Set<PreventivoEto> preventivo) {

    this.preventivo = preventivo;
  }

}
