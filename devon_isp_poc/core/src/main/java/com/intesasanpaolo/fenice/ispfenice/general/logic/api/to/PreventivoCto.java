package com.intesasanpaolo.fenice.ispfenice.general.logic.api.to;

import com.intesasanpaolo.fenice.ispfenice.general.common.api.to.AbstractCto;

/**
 * Composite transport object of Preventivo
 */
public class PreventivoCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private PreventivoEto preventivo;

  private OffertaEto offerta;

  public PreventivoEto getPreventivo() {

    return preventivo;
  }

  public void setPreventivo(PreventivoEto preventivo) {

    this.preventivo = preventivo;
  }

  public OffertaEto getOfferta() {

    return offerta;
  }

  public void setOfferta(OffertaEto offerta) {

    this.offerta = offerta;
  }

}
