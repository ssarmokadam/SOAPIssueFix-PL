package com.intesasanpaolo.fenice.ispfenice.general.logic.api.to;

import java.util.Set;

import com.intesasanpaolo.fenice.ispfenice.general.common.api.to.AbstractCto;

/**
 * Composite transport object of Intervista
 */
public class IntervistaCto extends AbstractCto {

  private static final long serialVersionUID = 1L;

  private IntervistaEto intervista;

  private Set<OffertaEto> offers;

  public IntervistaEto getIntervista() {

    return intervista;
  }

  public void setIntervista(IntervistaEto intervista) {

    this.intervista = intervista;
  }

  public Set<OffertaEto> getOffers() {

    return offers;
  }

  public void setOffers(Set<OffertaEto> offers) {

    this.offers = offers;
  }

}
